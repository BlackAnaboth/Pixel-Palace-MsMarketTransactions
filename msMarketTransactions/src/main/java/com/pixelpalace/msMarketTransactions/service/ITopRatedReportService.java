package com.pixelpalace.msMarketTransactions.service;

import com.pixelpalace.msMarketTransactions.dto.TopRatedReportDTO;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

public interface ITopRatedReportService {
    List<TopRatedReportDTO> generateTopRatedReports(
            LocalDate startDate, LocalDate endDate,
            List<String> categories, List<String> platforms);

    List<TopRatedReportDTO> generateTopRatedReports(
            @RequestParam @DateTimeFormat(pattern = "MM-yyyy") String startMonthYear,
            @RequestParam @DateTimeFormat(pattern = "MM-yyyy") String endMonthYear);

    List<TopRatedReportDTO> generateTopRatedReports(LocalDate startDate, LocalDate endDate);
}

