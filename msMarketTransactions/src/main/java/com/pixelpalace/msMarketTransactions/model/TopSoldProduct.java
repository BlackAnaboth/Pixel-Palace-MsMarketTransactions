package com.pixelpalace.msMarketTransactions.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TopSoldProducts")
public class TopSoldProduct {
    @Id
    private Long productId;
    private Long totalSales;
}
