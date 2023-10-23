package com.pixelpalace.msMarketTransactions.service.impl;

import com.pixelpalace.msMarketTransactions.dto.ProductDTO;
import com.pixelpalace.msMarketTransactions.dto.ProductListDTO;
import com.pixelpalace.msMarketTransactions.exception.EmptyProductsException;
import com.pixelpalace.msMarketTransactions.exception.NoSuchCategoryException;
import com.pixelpalace.msMarketTransactions.model.Category;
import com.pixelpalace.msMarketTransactions.model.Product;
import com.pixelpalace.msMarketTransactions.repository.IProductRepository;
import com.pixelpalace.msMarketTransactions.service.ICategoryService;
import com.pixelpalace.msMarketTransactions.service.IProductService;
import com.pixelpalace.msMarketTransactions.util.CategoryTypeEnum;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService implements IProductService {

    private final IProductRepository productRepository;
    private final ICategoryService categoryService;
    private ModelMapper modelMapper;

    public ProductService(IProductRepository productRepository, ICategoryService categoryService) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
        this.modelMapper = new ModelMapper();
    }

    @Override
    public ProductListDTO getProducts() {
        final List<Product> products = productRepository.findAll();

        return createProductList(products);
    }

    @Override
    public ProductListDTO getProducts(CategoryTypeEnum category) {

        Category category1 = categoryService.findByName(category)
                .orElseThrow(()-> new NoSuchCategoryException("No existe la categoria"));

        final List<Product> products = productRepository.findByCategoryName(category1.getName());

        return createProductList(products);
    }

    private ProductListDTO createProductList(final List<Product> products) {
        if (products.isEmpty()) {
            throw new EmptyProductsException("No se han encontrado productos");
        }

        List<ProductDTO> productDTO = products
                .stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .toList();

        return new ProductListDTO(productDTO);
    }
}
