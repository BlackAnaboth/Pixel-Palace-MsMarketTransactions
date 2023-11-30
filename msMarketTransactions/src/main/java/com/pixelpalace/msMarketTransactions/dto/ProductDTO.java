package com.pixelpalace.msMarketTransactions.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
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
    private Date releaseDate;
}
