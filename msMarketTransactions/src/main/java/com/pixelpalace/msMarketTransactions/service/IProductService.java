package com.pixelpalace.msMarketTransactions.service;

import com.pixelpalace.msMarketTransactions.dto.ProductListDTO;
import com.pixelpalace.msMarketTransactions.util.CategoryTypeEnum;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {

    ProductListDTO getProducts();

    ProductListDTO getProducts(CategoryTypeEnum category);
}
