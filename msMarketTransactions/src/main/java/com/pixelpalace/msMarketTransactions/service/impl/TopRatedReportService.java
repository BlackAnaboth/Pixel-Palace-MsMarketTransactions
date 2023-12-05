package com.pixelpalace.msMarketTransactions.service.impl;

import com.pixelpalace.msMarketTransactions.dto.TopRatedReportDTO;
import com.pixelpalace.msMarketTransactions.model.Category;
import com.pixelpalace.msMarketTransactions.model.Product;
import com.pixelpalace.msMarketTransactions.repository.TopRatedReportRepository;
import com.pixelpalace.msMarketTransactions.service.ITopRatedReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@Service
public class TopRatedReportService implements ITopRatedReportService {

    @Autowired
    private TopRatedReportRepository topRatedReportRepository;

    @Override
    public List<TopRatedReportDTO> generateTopRatedReports(
            @RequestParam @DateTimeFormat(pattern = "MM-yyyy") String startMonthYear,
            @RequestParam @DateTimeFormat(pattern = "MM-yyyy") String endMonthYear) {

        YearMonth startDate = YearMonth.parse(startMonthYear, DateTimeFormatter.ofPattern("MM-yyyy"));
        YearMonth endDate = YearMonth.parse(endMonthYear, DateTimeFormatter.ofPattern("MM-yyyy"));

        List<Product> topRatedProducts = topRatedReportRepository.findTopRatedProductsBetweenDates(startDate, endDate);
        return transformToTopRatedReports(topRatedProducts);
    }

    private List<TopRatedReportDTO> transformToTopRatedReports(List<Product> products) {
        List<TopRatedReportDTO> topRatedReports = new ArrayList<>();

        for (Product product : products) {
            if (product != null) {
                List<String> categoryNames = getCategoryNames(product.getCategories());

                TopRatedReportDTO topRatedReport = new TopRatedReportDTO(
                        product.getName(),
                        product.getStock(),
                        categoryNames
                );

                topRatedReports.add(topRatedReport);
            }
        }

        return topRatedReports;
    }

    private List<String> getCategoryNames(List<Category> categories) {
        List<String> categoryNames = new ArrayList<>();

        if (categories != null) {
            for (Category category : categories) {
                if (category != null) {
                    categoryNames.add(category.getName());
                }
            }
        }

        return categoryNames;
    }

    @Override
    public List<TopRatedReportDTO> generateTopRatedReports(LocalDate startDate, LocalDate endDate) {
        return null;
    }
}