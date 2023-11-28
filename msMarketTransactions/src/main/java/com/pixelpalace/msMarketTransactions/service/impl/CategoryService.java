package com.pixelpalace.msMarketTransactions.service.impl;

import com.pixelpalace.msMarketTransactions.dto.CategoryDTO;
import com.pixelpalace.msMarketTransactions.dto.CategoryListDTO;
import com.pixelpalace.msMarketTransactions.exception.CategoryNotFoundException;
import com.pixelpalace.msMarketTransactions.model.Category;
import com.pixelpalace.msMarketTransactions.model.Product;
import com.pixelpalace.msMarketTransactions.repository.ICategoryRepository;
import com.pixelpalace.msMarketTransactions.service.ICategoryService;
import com.pixelpalace.msMarketTransactions.util.CategoryTypeEnum;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService implements ICategoryService {

    private final ICategoryRepository categoryRepository;
    private ModelMapper modelMapper;

    public CategoryService(ICategoryRepository genreRepository) {
        this.categoryRepository = genreRepository;
        this.modelMapper = new ModelMapper();
    }

    @Override
    public Optional<Category> findByName(CategoryTypeEnum category) {
        return categoryRepository.findByName(category.getDescription());
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category saveProduct(Long categoryId, Product product) {
        Category category = categoryRepository.findById(categoryId).orElse(null);
        if (category != null) {
            List<Product> products = new ArrayList<>(category.getProducts());
            products.add(product);
            category.setProducts(products);
            categoryRepository.save(category);
        } else {
        throw new CategoryNotFoundException("No se ha encontrado la categoria de Id " + categoryId);
    }
        return category;
    }

    @Override
    public CategoryListDTO getCategories(){
        List<Category> categories = categoryRepository.getAllCategoryNames();
        List<CategoryDTO> categoryDTOS = categories.stream().map(category -> modelMapper.map(category, CategoryDTO.class)).collect(Collectors.toList());
        return new CategoryListDTO(categoryDTOS);
    }
}
