package com.pixelpalace.msMarketTransactions.service;

import com.pixelpalace.msMarketTransactions.dto.TopRatedReportDTO;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

public interface ITopSoldReportService {
    List<TopRatedReportDTO> generateTopSoldReports(
            LocalDate startDate, LocalDate endDate,
            List<String> categories, List<String> platforms);

    List<TopRatedReportDTO> generateTopSoldReports(
            String startDate, String endDate,
            List<String> categories, List<String> platforms);

    List<TopRatedReportDTO> generateTopSoldReports(
            @RequestParam @DateTimeFormat(pattern = "MM-yyyy") String startMonthYear,
            @RequestParam @DateTimeFormat(pattern = "MM-yyyy") String endMonthYear);

    List<TopRatedReportDTO> generateTopSoldReports(LocalDate startDate, LocalDate endDate);
}
