package com.microservices.ventas.ventas.service.impl;

import com.microservices.ventas.ventas.dto.GetProductDTO;
import com.microservices.ventas.ventas.dto.GetSaleDTO;
import com.microservices.ventas.ventas.model.Sale;
import com.microservices.ventas.ventas.repository.ApiCart;
import com.microservices.ventas.ventas.repository.ApiProduct;
import com.microservices.ventas.ventas.repository.SaleRepository;
import com.microservices.ventas.ventas.service.SaleService;
import com.microservices.ventas.ventas.utils.GenerateNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private ApiProduct apiProduct;
    @Autowired
    private ApiCart apiCart;

    @Override
    public void saveSale(Long cartId) {
        boolean exists = apiCart.existsCart(cartId);
        if (exists) {
            Sale sale = new Sale(LocalDate.now(), "ORDER-" + GenerateNumber.getRandomNumber(0, 1000));
            sale.setCartId(cartId);
            saleRepository.save(sale);
        } else {
            throw new RuntimeException("Cart not exists");
        }
    }

    @Override
    public Sale getSaleById(Long id) {
        return saleRepository.findById(id).orElse(null);
    }

    @Override
    public GetSaleDTO getSaleDTOById(Long id) {
        Sale sale = getSaleById(id);
        if (sale == null) {
            return null;
        }
        return new GetSaleDTO(sale);
    }

    public GetProductDTO getProduct(Long id) {
        return apiProduct.getProductById(id);
    }

    @Override
    public GetSaleDTO getSaleByCartId(Long id) {
        Sale sale = saleRepository.getByCartId(id);
        if (sale == null) {
            return null;
        }
        return new GetSaleDTO(sale);
    }
}
