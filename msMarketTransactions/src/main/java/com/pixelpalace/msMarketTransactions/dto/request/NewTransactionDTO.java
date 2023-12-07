package com.pixelpalace.msMarketTransactions.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class NewTransactionDTO {

    @JsonProperty("user_id")
    private long userId;

    @JsonProperty("product_id")
    private long productId;

    @JsonProperty("platform_id")
    private long platformId;

    @JsonProperty("date")
    private String date;

    @JsonProperty("price")
    private Double price;

}
