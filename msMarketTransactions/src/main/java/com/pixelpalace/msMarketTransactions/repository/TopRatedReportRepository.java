package com.pixelpalace.msMarketTransactions.repository;

import com.pixelpalace.msMarketTransactions.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TopRatedReportRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.releaseDate BETWEEN :startDate AND :endDate ORDER BY p.score DESC")
    List<Product> findTopRatedProductsBetweenDates(
            @Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate);
}

