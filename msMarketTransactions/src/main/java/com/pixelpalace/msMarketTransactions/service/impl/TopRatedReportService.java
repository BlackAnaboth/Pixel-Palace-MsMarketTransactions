package com.pixelpalace.msMarketTransactions.service.impl;

import com.pixelpalace.msMarketTransactions.dto.TopRatedReportDTO;
import com.pixelpalace.msMarketTransactions.model.Category;
import com.pixelpalace.msMarketTransactions.model.Platform;
import com.pixelpalace.msMarketTransactions.model.Product;
import com.pixelpalace.msMarketTransactions.repository.TopRatedReportRepository;
import com.pixelpalace.msMarketTransactions.service.ITopRatedReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class TopRatedReportService implements ITopRatedReportService {

    @Autowired
    private TopRatedReportRepository topRatedReportRepository;

    @Override
    public List<TopRatedReportDTO> generateTopRatedReports(
            LocalDate startDate, LocalDate endDate,
            List<String> categories, List<String> platforms) {

        List<Product> topRatedProducts = topRatedReportRepository.findTopRatedProductsBetweenDatesAndFilters(
                startDate, endDate, categories, platforms);

        return transformToTopRatedReports(topRatedProducts);
    }

    private List<TopRatedReportDTO> transformToTopRatedReports(List<Product> products) {
        List<TopRatedReportDTO> topRatedReports = new ArrayList<>();

        for (Product product : products) {
            if (product != null) {
                List<String> categoryNames = getCategoryNames(product.getCategories());
                List<String> platformNames = getPlatformNames(product.getPlatforms());

                TopRatedReportDTO topRatedReport = new TopRatedReportDTO(
                        product.getName(),
                        product.getStock(),
                        categoryNames,
                        platformNames
                );

                topRatedReports.add(topRatedReport);
            }
        }

        return topRatedReports;
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
    public List<TopRatedReportDTO> generateTopRatedReports(String startMonthYear, String endMonthYear) {
        return null;
    }

    @Override
    public List<TopRatedReportDTO> generateTopRatedReports(LocalDate startDate, LocalDate endDate) {
        return null;
    }
}