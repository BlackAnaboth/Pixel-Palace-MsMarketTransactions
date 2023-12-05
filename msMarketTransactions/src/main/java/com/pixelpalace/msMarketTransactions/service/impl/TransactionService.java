package com.pixelpalace.msMarketTransactions.service.impl;

import com.pixelpalace.msMarketTransactions.dto.*;
import com.pixelpalace.msMarketTransactions.dto.request.NewTransactionDTO;
import com.pixelpalace.msMarketTransactions.exception.PlatformNotFoundException;
import com.pixelpalace.msMarketTransactions.exception.ProductNotFoundException;
import com.pixelpalace.msMarketTransactions.exception.UserNotFoundException;
import com.pixelpalace.msMarketTransactions.model.PixelUser;
import com.pixelpalace.msMarketTransactions.model.Platform;
import com.pixelpalace.msMarketTransactions.model.Product;
import com.pixelpalace.msMarketTransactions.model.Transaction;
import com.pixelpalace.msMarketTransactions.repository.IProductRepository;
import com.pixelpalace.msMarketTransactions.repository.ITransactionRepository;
import com.pixelpalace.msMarketTransactions.repository.PixelUserRepository;
import com.pixelpalace.msMarketTransactions.service.IPlatformService;
import com.pixelpalace.msMarketTransactions.service.ITransactionService;
import com.pixelpalace.msMarketTransactions.service.PixelUserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TransactionService implements ITransactionService {

    private final ITransactionRepository iTransactionRepository;


    private  final IProductRepository productRepository;
    private final IPlatformService platformService;

    private final PixelUserService pixelUserService;
    private final PixelUserRepository pixelUserRepository;

    private final ModelMapper modelMapper;

    public TransactionService(ITransactionRepository iTransactionRepository, IProductRepository productRepository, IPlatformService platformService, PixelUserService pixelUserService, PixelUserRepository pixelUserRepository) {
        this.iTransactionRepository = iTransactionRepository;
        this.productRepository = productRepository;
        this.platformService = platformService;
        this.pixelUserService = pixelUserService;
        this.pixelUserRepository = pixelUserRepository;
        this.modelMapper = new ModelMapper();
    }


    @Override
    public TransactionListDto getTransactionListDto() {
        List<Transaction> transactions = iTransactionRepository.findAll();
        return createTransactionList(transactions);
    }

    @Override
    public TransactionDTO getTransactionById(Long Id) {
        Transaction transaction = iTransactionRepository.findById(Id).orElse(null);

        if (transaction == null) {
            // Puedes lanzar una excepción aquí si prefieres.
            return null;
        }

        return transactionMapperToDTO(transaction);
    }

    @Override
    public TransactionDTO createTransaction(NewTransactionDTO newTransactionDTO) {
        UUID codeForTransaction = UUID.randomUUID();
        PixelUser user = pixelUserRepository.findById(newTransactionDTO.getUserId()).orElseThrow(() -> new UserNotFoundException("El usuario con id: " + newTransactionDTO.getUserId() + " no ha sido encontrado."));
        Product product = productRepository.findById(newTransactionDTO.getProductId()).orElseThrow(() -> new ProductNotFoundException("El producto con id: " + newTransactionDTO.getProductId() + " no ha sido encontrada."));
        Platform platform = platformService.findById(newTransactionDTO.getPlatformId()).orElseThrow(() -> new PlatformNotFoundException("La plataforma con id" + newTransactionDTO.getPlatformId() + "no ha sido encontrada."));

        Transaction transactionToSave = new Transaction();
        transactionToSave.setStatus("SUCCESS");
        transactionToSave.setCode(codeForTransaction.toString());
        transactionToSave.setDate(newTransactionDTO.getDate());
        transactionToSave.setPrice(newTransactionDTO.getPrice());
        transactionToSave.getProducts().add(product);
        transactionToSave.setIduser(user);
        transactionToSave.getPlatform().add(platform);

        var transactionSaved = iTransactionRepository.save(transactionToSave);
        return transactionMapperToDTO(transactionSaved);
    }





       /* PixelUser pixelUser = userServiceClient.findUserById(IdUser);

        Transaction transaction = new Transaction();
        transaction.setStatus(newTransactionDTO.getStatus());
        transaction.setCode(newTransactionDTO.getCode());

        List<Product> productList = newTransactionDTO.getProducts().stream()
                .map(productId -> Long.parseLong(productId))
                .map(productId -> productRepository.findById(productId).orElse(null))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        transaction.setProducts(productList);

        List<Platform> platformList = newTransactionDTO.getPlatform().stream()
                .map(platformId -> Long.parseLong(platformId)) // Conversión a Long
                .map(platformId -> platformService.findById(platformId).orElse(null))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        transaction.setPlatform(platformList);

         Asignar el PixelUser a la transacción
        transaction.setIduser(pixelUser);

        Guardar la transacción en el repositorio
        transaction = iTransactionRepository.save(transaction);

         Usa el mapper para convertir la transacción a un DTO
        TransactionDTO transactionDTO = transactionMapperToDTO(transaction);

        return transactionDTO;*/


    public TransactionListDto createTransactionList(List<Transaction> transactions) {
        if (transactions.isEmpty()) {
            // Puedes lanzar una excepción aquí si prefieres.
            return null;
        }

        List<TransactionDTO> transactionDTOList = transactions
                .stream()
                .map(this::transactionMapperToDTO)
                .collect(Collectors.toList());

        return new TransactionListDto(transactionDTOList);
    }

    private TransactionDTO transactionMapperToDTO(final Transaction transaction) {
        TransactionDTO transactionDTO = modelMapper.map(transaction, TransactionDTO.class);
        transactionDTO.setProducts(transaction.getProducts().stream().map(Product::getName).collect(Collectors.toList()));
        transactionDTO.setPlatforms(transaction.getPlatform().stream().map(Platform::getName).collect(Collectors.toList()));
        PixelUser pixelUserDTO = modelMapper.map(transaction.getIduser(), PixelUser.class);
        transactionDTO.setUserId(pixelUserDTO.getId());
        return transactionDTO;
    }
}
