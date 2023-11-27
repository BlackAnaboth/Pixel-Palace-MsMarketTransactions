package com.pixelpalace.msMarketTransactions.controller;

import com.pixelpalace.msMarketTransactions.dto.CategoryListDTO;
import com.pixelpalace.msMarketTransactions.dto.PlatformListDTO;
import com.pixelpalace.msMarketTransactions.service.ICategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/all")
    public ResponseEntity<CategoryListDTO> getCategoryList(){
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.getCategories());
    }
}
