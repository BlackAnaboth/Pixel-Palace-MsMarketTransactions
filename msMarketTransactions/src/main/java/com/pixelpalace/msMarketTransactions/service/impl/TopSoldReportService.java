package com.pixelpalace.msMarketTransactions.service.impl;

import com.pixelpalace.msMarketTransactions.dto.TopRatedReportDTO;
import com.pixelpalace.msMarketTransactions.model.Category;
import com.pixelpalace.msMarketTransactions.model.Platform;
import com.pixelpalace.msMarketTransactions.model.Product;
import com.pixelpalace.msMarketTransactions.repository.TopSoldReportRepository;
import com.pixelpalace.msMarketTransactions.service.ITopSoldReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopSoldReportService implements ITopSoldReportService {

    @Autowired
    private TopSoldReportRepository topSoldReportRepository;

    @Override
    public List<TopRatedReportDTO> generateTopSoldReports(
            LocalDate startDate, LocalDate endDate,
            List<String> categories, List<String> platforms) {

        List<Product> topSoldProducts = topSoldReportRepository.findTopSoldProductsBetweenDatesAndFilters(
                startDate, endDate, categories, platforms);

        return transformToTopSoldReports(topSoldProducts);
    }

    private List<TopRatedReportDTO> transformToTopSoldReports(List<Product> products) {
        List<TopRatedReportDTO> topSoldReports = new ArrayList<>();

        for (Product product : products) {
            if (product != null) {
                List<String> categoryNames = getCategoryNames(product.getCategories());
                List<String> platformNames = getPlatformNames(product.getPlatforms());

                TopRatedReportDTO topSoldReport = new TopRatedReportDTO(
                        product.getName(),
                        product.getStock(),
                        categoryNames,
                        platformNames
                );

                topSoldReports.add(topSoldReport);
            }
        }

        return topSoldReports;
    }

    private List<String> getCategoryNames(List<Category> categories) {
        return categories.stream()
                .map(Category::getName)
                .collect(Collectors.toList());
    }

    private List<String> getPlatformNames(List<Platform> platforms) {
        return platforms.stream()
                .map(Platform::getName)
                .collect(Collectors.toList());
    }

    @Override
    public List<TopRatedReportDTO> generateTopSoldReports(String startDate, String endDate, List<String> categories, List<String> platforms) {
        return null;
    }

    @Override
    public List<TopRatedReportDTO> generateTopSoldReports(String startMonthYear, String endMonthYear) {
        return null;
    }

    @Override
    public List<TopRatedReportDTO> generateTopSoldReports(LocalDate startDate, LocalDate endDate) {
        return null;
    }
}
