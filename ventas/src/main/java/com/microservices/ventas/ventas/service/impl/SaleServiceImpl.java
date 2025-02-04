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
    public Object getSaleById(Long id) {
        Sale sale = saleRepository.findById(id).orElse(null);
        if (sale == null) {
            return null;
        }else{
            GetSaleDTO products = apiCart.getCart(sale.getCartId());
            return new GetSaleDTO(sale, products.getIdSale(), products.getCartId(), products.getTotal(), products.getProducts());
        }
    }

    public GetProductDTO getProduct(Long id) {
        return apiProduct.getProductById(id);
    }
}
