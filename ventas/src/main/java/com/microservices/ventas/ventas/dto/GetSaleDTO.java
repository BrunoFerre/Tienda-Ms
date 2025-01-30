package com.microservices.ventas.ventas.dto;

import com.microservices.ventas.ventas.model.Sale;

import java.time.LocalDate;

public class GetSaleDTO {
    private Long id;
    private LocalDate date;
    private String orderNumber;
    private Long cartId;

    public GetSaleDTO() {
    }

    public GetSaleDTO(Sale sale) {
        this.id = sale.getId();
        this.date = sale.getDate();
        this.orderNumber = sale.getOrderNumber();
        this.cartId = sale.getCartId();
    }

    public Long getId() {
        return id;
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
}
