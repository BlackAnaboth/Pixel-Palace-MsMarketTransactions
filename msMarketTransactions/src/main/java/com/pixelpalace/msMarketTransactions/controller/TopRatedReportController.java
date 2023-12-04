package com.pixelpalace.msMarketTransactions.controller;

import com.pixelpalace.msMarketTransactions.dto.TopRatedReportDTO;
import com.pixelpalace.msMarketTransactions.service.ITopRatedReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/reports")
public class TopRatedReportController {

    @Autowired
    private ITopRatedReportService topRatedReportService;

    @GetMapping("/top-rated-products")
    public ResponseEntity<List<TopRatedReportDTO>> getTopRatedProducts(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {

        List<TopRatedReportDTO> topRatedProducts = topRatedReportService.generateTopRatedReports(startDate, endDate);
        return new ResponseEntity<>(topRatedProducts, HttpStatus.OK);
    }
}

