package com.microservices.ventas.ventas.service;

import com.microservices.ventas.ventas.dto.GetSaleDTO;
import com.microservices.ventas.ventas.model.Sale;

public interface SaleService {

    void saveSale(Long cartId);

    Sale getSaleById(Long id);

    GetSaleDTO getSaleDTOById(Long id);

    GetSaleDTO getSaleByCartId(Long id);
}
