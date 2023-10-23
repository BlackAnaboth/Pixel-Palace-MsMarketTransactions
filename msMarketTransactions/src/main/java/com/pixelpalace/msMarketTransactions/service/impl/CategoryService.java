package com.pixelpalace.msMarketTransactions.service.impl;

import com.pixelpalace.msMarketTransactions.model.Category;
import com.pixelpalace.msMarketTransactions.repository.ICategoryRepository;
import com.pixelpalace.msMarketTransactions.service.ICategoryService;
import com.pixelpalace.msMarketTransactions.util.CategoryTypeEnum;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {

    private final ICategoryRepository categoryRepository;

    public CategoryService(ICategoryRepository genreRepository) {
        this.categoryRepository = genreRepository;
    }

    @Override
    public Optional<Category> findByName(CategoryTypeEnum category) {
        return categoryRepository.findByName(category.getDescription());
    }
}
