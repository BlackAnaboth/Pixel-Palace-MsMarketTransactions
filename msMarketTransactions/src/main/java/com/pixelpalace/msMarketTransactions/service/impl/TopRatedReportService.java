package com.pixelpalace.msMarketTransactions.service.impl;

import com.pixelpalace.msMarketTransactions.dto.TopRatedReportDTO;
import com.pixelpalace.msMarketTransactions.model.Category;
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
    public List<TopRatedReportDTO> generateTopRatedReports(LocalDate startDate, LocalDate endDate) {
        List<Product> topRatedProducts = topRatedReportRepository.findTopRatedProductsBetweenDates(startDate, endDate);
        return transformToTopRatedReports(topRatedProducts);
    }

    private List<TopRatedReportDTO> transformToTopRatedReports(List<Product> products) {
        List<TopRatedReportDTO> topRatedReports = new ArrayList<>();

        for (Product product : products) {
            List<String> categoryNames = getCategoryNames(product.getCategories());

            TopRatedReportDTO topRatedReport = new TopRatedReportDTO(
                    product.getName(),
                    product.getStock(),
                    categoryNames
            );

            topRatedReports.add(topRatedReport);
        }

        return topRatedReports;
    }

    private List<String> getCategoryNames(List<Category> categories) {
        return categories.stream()
                .map(Category::getName)
                .collect(Collectors.toList());
    }
}

