package com.pixelpalace.msMarketTransactions.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.pixelpalace.msMarketTransactions.dto.response.ProductResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class TransactionDTO {
    private Long id;
    private String status;
    private String code;
    private Long userId;
    private List<ProductResponseDTO> products;
    private List<String> platforms;
    private String date;
}