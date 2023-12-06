package com.pixelpalace.msMarketTransactions.model;

import jakarta.persistence.Column;
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
    @Column(name = "product_id")
    private Long productId;
    private Long totalSales;
}
