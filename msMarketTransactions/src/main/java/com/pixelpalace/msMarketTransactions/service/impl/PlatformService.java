package com.pixelpalace.msMarketTransactions.service.impl;

import com.pixelpalace.msMarketTransactions.dto.PlatformDTO;
import com.pixelpalace.msMarketTransactions.dto.PlatformListDTO;
import com.pixelpalace.msMarketTransactions.exception.PlatformNotFoundException;
import com.pixelpalace.msMarketTransactions.model.Platform;
import com.pixelpalace.msMarketTransactions.model.Product;
import com.pixelpalace.msMarketTransactions.repository.IPlatformRepository;
import com.pixelpalace.msMarketTransactions.service.IPlatformService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlatformService implements IPlatformService {

    private final IPlatformRepository platformRepository;
    private ModelMapper modelMapper;

    public PlatformService(IPlatformRepository platformRepository) {
        this.platformRepository = platformRepository;
        this.modelMapper = new ModelMapper();
    }

    @Override
    public Optional<Platform> findById(Long id) {
        return platformRepository.findById(id);
    }

    @Override
    public Platform saveProduct(Long platformId, Product product) {
        Platform platform = platformRepository.findById(platformId).orElse(null);
        if (platform != null) {
            List<Product> products = new ArrayList<>(platform.getProducts());
            products.add(product);
            platform.setProducts(products);
            platformRepository.save(platform);
        } else {
            throw new PlatformNotFoundException("No se ha encontrado la plataforma de Id " + platformId);
        }
        return platform;
    }

    @Override
    public PlatformListDTO getPlatforms(){
        List<Platform> platforms = platformRepository.getAllPlatforms();
        List<PlatformDTO> platformDTOS = platforms.stream().map(platform -> modelMapper.map(platform, PlatformDTO.class)).collect(Collectors.toList());
        return new PlatformListDTO(platformDTOS);
    }
}
