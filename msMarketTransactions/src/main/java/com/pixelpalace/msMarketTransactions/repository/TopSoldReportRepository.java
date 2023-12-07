package com.pixelpalace.msMarketTransactions.repository;

import com.pixelpalace.msMarketTransactions.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TopSoldReportRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p " +
            "JOIN p.transactions t " +
            "WHERE (:startDate IS NULL OR t.date BETWEEN :startDate AND :endDate) " +
            "AND (:endDate IS NULL OR t.date <= :endDate) " +
            "AND (:categories IS NULL OR EXISTS (SELECT c FROM p.categories c WHERE c.name IN :categories)) " +
            "AND (:platforms IS NULL OR EXISTS (SELECT pl FROM p.platforms pl WHERE pl.name IN :platforms)) " +
            "GROUP BY p " +
            "ORDER BY COUNT(t) DESC")
    List<Product> findTopSoldProductsBetweenDatesAndFilters(
            @Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate,
            @Param("categories") List<String> categories,
            @Param("platforms") List<String> platforms);
}

