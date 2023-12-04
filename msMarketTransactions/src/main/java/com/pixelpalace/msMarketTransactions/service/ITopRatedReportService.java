package com.pixelpalace.msMarketTransactions.service;

import com.pixelpalace.msMarketTransactions.dto.TopRatedReportDTO;

import java.time.LocalDate;
import java.util.List;

public interface ITopRatedReportService {
    List<TopRatedReportDTO> generateTopRatedReports(LocalDate startDate, LocalDate endDate);
}

