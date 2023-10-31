package com.pixelpalace.msMarketTransactions.service.impl;

import com.pixelpalace.msMarketTransactions.dto.request.NewProductDTO;
import com.pixelpalace.msMarketTransactions.dto.request.ProductRequestDTO;
import com.pixelpalace.msMarketTransactions.model.Category;
import com.pixelpalace.msMarketTransactions.model.Platform;
import com.pixelpalace.msMarketTransactions.model.Product;
import com.pixelpalace.msMarketTransactions.repository.IProductRepository;
import com.pixelpalace.msMarketTransactions.service.ICategoryService;
import com.pixelpalace.msMarketTransactions.service.IPlatformService;
import com.pixelpalace.msMarketTransactions.util.CategoryTypeEnum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @InjectMocks
    ProductService productService;

    @Mock
    IProductRepository productRepository;

    @Mock
    ICategoryService categoryService;

    @Mock
    IPlatformService platformService;

    @Spy
    ModelMapper modelMapper;

    @Test
    void when_get_products_ok() {
        Category category = Category.builder()
                .id(1L)
                .name("sports")
                .description("deportes")
                .build();
        Platform platform = Platform.builder()
                .id(1L)
                .name("PC")
                .description("PC")
                .build();
        Product product = Product.builder()
                .id(1L)
                .price(15.00)
                .categories(List.of(category))
                .platforms(List.of(platform))
                .name("fifa")
                .build();
        when(productRepository.findAll()).thenReturn(List.of(product));

        assertNotNull(productService.getProducts());
    }

    @Test
    void when_get_products_by_category_ok() {
        Category category = Category.builder()
                .id(1L)
                .name("Sports")
                .description("deportes")
                .build();
        Platform platform = Platform.builder()
                .id(1L)
                .name("PC")
                .description("PC")
                .build();
        Product product = Product.builder()
                .id(1L)
                .price(15.00)
                .categories(List.of(category))
                .platforms(List.of(platform))
                .name("fifa")
                .build();
        when(categoryService.findByName(CategoryTypeEnum.SPORTS)).thenReturn(java.util.Optional.of(category));
        when(productRepository.findByCategoryName("Sports")).thenReturn(List.of(product));

        assertNotNull(productService.getProducts(CategoryTypeEnum.SPORTS));
    }

    @Test
    void when_get_product_by_id_ok() {
        Category category = Category.builder()
                .id(1L)
                .name("Sports")
                .description("deportes")
                .build();
        Platform platform = Platform.builder()
                .id(1L)
                .name("PC")
                .description("PC")
                .build();
        Product product = Product.builder()
                .id(1L)
                .price(15.00)
                .categories(List.of(category))
                .platforms(List.of(platform))
                .name("fifa")
                .build();
        when(productRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(product));
        assertNotNull(productService.getProductById(1L));
    }

    @Test
    void when_get_product_by_name_ok() {
        Category category = Category.builder()
                .id(1L)
                .name("Sports")
                .description("deportes")
                .build();
        Platform platform = Platform.builder()
                .id(1L)
                .name("PC")
                .description("PC")
                .build();
        Product product = Product.builder()
                .id(1L)
                .price(15.00)
                .categories(List.of(category))
                .platforms(List.of(platform))
                .name("fifa")
                .build();
        when(productRepository.findByNameContaining("fifa")).thenReturn(List.of(product));
        assertNotNull(productService.getProductByName("fifa"));
    }

    @Test
    void when_create_product_ok() {
        Category category = Category.builder()
                .id(1L)
                .name("Sports")
                .description("deportes")
                .build();
        Platform platform = Platform.builder()
                .id(1L)
                .name("PC")
                .description("PC")
                .build();
        NewProductDTO newProduct = NewProductDTO.builder()
                .price(15.00)
                .categoriesId(List.of(1L))
                .platformsId(List.of(1L))
                .name("fifa")
                .build();
        Product product = Product.builder()
                .price(15.00)
                .categories(List.of(category))
                .platforms(List.of(platform))
                .name("fifa")
                .build();
        when(categoryService.findById(1L)).thenReturn(java.util.Optional.ofNullable(category));
        when(platformService.findById(1L)).thenReturn(java.util.Optional.ofNullable(platform));
        when(productRepository.save(any())).thenReturn(product);
        when(categoryService.saveProduct(1L, product)).thenReturn(category);
        when(platformService.saveProduct(1L, product)).thenReturn(platform);
        assertNotNull(productService.createProduct(newProduct));
    }

    @Test
    void when_update_product_ok() {
        Category category = Category.builder()
                .id(1L)
                .name("Sports")
                .description("deportes")
                .build();
        Platform platform = Platform.builder()
                .id(1L)
                .name("PC")
                .description("PC")
                .build();
        ProductRequestDTO productRequestDTO = ProductRequestDTO.builder()
                .id(1L)
                .price(15.00)
                .categoriesId(List.of(1L))
                .platformsId(List.of(1L))
                .name("fifa")
                .build();
        Product product = Product.builder()
                .price(15.00)
                .categories(List.of(category))
                .platforms(List.of(platform))
                .name("fifa")
                .build();
        when(productRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(product));
        when(categoryService.findById(1L)).thenReturn(java.util.Optional.ofNullable(category));
        when(platformService.findById(1L)).thenReturn(java.util.Optional.ofNullable(platform));
        when(productRepository.save(any())).thenReturn(product);
        assertNotNull(productService.updateProduct(productRequestDTO));
    }

    @Test
    void when_delete_product_ok() {
        Product product = Product.builder()
                .price(15.00)
                .name("fifa")
                .build();
        when(productRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(product));
        assertNotNull(productService.deleteProduct(1L));
    }

}