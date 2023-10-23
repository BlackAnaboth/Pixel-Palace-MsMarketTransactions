package com.pixelpalace.msMarketTransactions.dto;

import com.pixelpalace.msMarketTransactions.model.Category;
import com.pixelpalace.msMarketTransactions.model.Platform;

import java.util.List;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private List<Category> categories;
    private List<Platform> platforms;
    private Double price;
}
