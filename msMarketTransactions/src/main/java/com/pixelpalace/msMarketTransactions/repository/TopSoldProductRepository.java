package com.pixelpalace.msMarketTransactions.repository;

import com.pixelpalace.msMarketTransactions.model.TopSoldProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface TopSoldProductRepository extends JpaRepository<TopSoldProduct, Long> {
    @Query(nativeQuery = true,
            value = "SELECT tp.product_id AS productId, COUNT(tp.product_id) AS totalSales " +
                    "FROM transactions_product tp " +
                    "JOIN transactions t ON tp.transacction_id = t.transacction_id " +
                    "WHERE t.date >= :startDate " +
                    "GROUP BY tp.product_id " +
                    "ORDER BY totalSales DESC " +
                    "LIMIT :3")
    List<TopSoldProduct> findTopSoldProducts(@Param("startDate") LocalDate startDate);
}
