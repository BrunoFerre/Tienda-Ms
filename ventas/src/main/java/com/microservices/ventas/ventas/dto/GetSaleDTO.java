package com.microservices.ventas.ventas.dto;


import com.microservices.ventas.ventas.model.Sale;

import java.time.LocalDate;
import java.util.List;

public class GetSaleDTO {
    private Long idSale;
    private LocalDate date;
    private String orderNumber;
    private Long cartId;
    private Double total;
    private List<GetProductDTO> products;

    public GetSaleDTO() {
    }
    public GetSaleDTO(Sale sale, Long id, Long userId, Double total, List<GetProductDTO> products) {
        this.idSale = sale.getId();
        this.date = sale.getDate();
        this.orderNumber = sale.getOrderNumber();
        this.cartId = sale.getCartId();
        this.total = total;
        this.products = products;
    }

    public Long getIdSale() {
        return idSale;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Long getCartId() {
        return cartId;
    }

    public Double getTotal() {
        return total;
    }

    public List<GetProductDTO> getProducts() {
        return products;
    }
}
