package com.pixelpalace.msMarketTransactions.repository;

import com.pixelpalace.msMarketTransactions.model.TopSoldProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface TopSoldProductRepository extends JpaRepository<TopSoldProduct, Long> {
    @Query(nativeQuery = true,
            value = "SELECT tp.productId AS productId, COUNT(tp.productId) AS totalSales " +
                    "FROM transactions_product tp " +
                    "JOIN transactions t ON tp.transactionId = t.id " +
                    "WHERE t.date >= :startDate " +
                    "GROUP BY tp.productId " +
                    "ORDER BY totalSales DESC " +
                    "LIMIT 3"
    )
    List<TopSoldProduct> findTopSoldProducts(@Param("startDate") LocalDate startDate);
}
