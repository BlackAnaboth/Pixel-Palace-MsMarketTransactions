package com.pixelpalace.msMarketTransactions.service.impl;

import com.pixelpalace.msMarketTransactions.model.TopSoldProduct;
import com.pixelpalace.msMarketTransactions.repository.TopSoldProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TopSoldProductService {
    @Autowired
    private TopSoldProductRepository topSoldProductRepository;

    public List<TopSoldProduct> getTopSoldProductsWeekly() {
        LocalDate startDate = LocalDate.now().minusWeeks(1);
        return topSoldProductRepository.findTopSoldProducts(startDate);
    }

    public List<TopSoldProduct> getTopSoldProductsMonthly() {
        LocalDate startDate = LocalDate.now().minusMonths(1);
        return topSoldProductRepository.findTopSoldProducts(startDate);
    }

    public List<TopSoldProduct> getTopSoldProductsYearly() {
        LocalDate startDate = LocalDate.now().minusYears(1);
        return topSoldProductRepository.findTopSoldProducts(startDate);
    }
}
