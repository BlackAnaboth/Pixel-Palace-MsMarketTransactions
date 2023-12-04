package com.pixelpalace.msMarketTransactions.controller;

import com.pixelpalace.msMarketTransactions.model.TopSoldProduct;
import com.pixelpalace.msMarketTransactions.service.impl.TopSoldProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/reports")
public class TopSoldController {
    @Autowired
    private TopSoldProductService topSoldProductService;

    @GetMapping("/top-sold-weekly")
    public List<TopSoldProduct> getTopSoldProductsWeekly() {
        return topSoldProductService.getTopSoldProductsWeekly();
    }

    @GetMapping("/top-sold-monthly")
    public List<TopSoldProduct> getTopSoldProductsMonthly() {
        return topSoldProductService.getTopSoldProductsMonthly();
    }

    @GetMapping("/top-sold-yearly")
    public List<TopSoldProduct> getTopSoldProductsYearly() {
        return topSoldProductService.getTopSoldProductsYearly();
    }
}

