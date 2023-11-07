package com.pixelpalace.msMarketTransactions.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private List<String> categories;
    private List<String> platforms;
    private Double price;
    private Double score;
    private List<String> imageUrl;
    private Double stock;
}
