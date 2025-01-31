package com.microservices.ventas.ventas.service;

import com.microservices.ventas.ventas.dto.GetSaleDTO;

public interface SaleService {

    void saveSale(Long cartId);

    GetSaleDTO getSaleById(Long id);

}
