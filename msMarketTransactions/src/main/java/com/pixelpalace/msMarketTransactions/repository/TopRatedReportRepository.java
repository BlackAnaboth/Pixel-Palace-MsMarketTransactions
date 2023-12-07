package com.pixelpalace.msMarketTransactions.repository;

import com.pixelpalace.msMarketTransactions.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

@Repository
public interface TopRatedReportRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p " +
            "WHERE (:startDate IS NULL OR p.releaseDate BETWEEN :startDate AND :endDate) " +
            "AND (:endDate IS NULL OR p.releaseDate <= :endDate) " +
            "AND (:categories IS NULL OR EXISTS (SELECT c FROM p.categories c WHERE c.name IN :categories)) " +
            "AND (:platforms IS NULL OR EXISTS (SELECT pl FROM p.platforms pl WHERE pl.name IN :platforms)) " +
            "ORDER BY p.score DESC")
    List<Product> findTopRatedProductsBetweenDatesAndFilters(
            @Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate,
            @Param("categories") List<String> categories,
            @Param("platforms") List<String> platforms);
}

