package com.microservices.carrito.carrito.dto;

import com.microservices.carrito.carrito.model.Details;

public class GetDetailsDTO {
    private Long id;
    private String name;
    private Long productId;
    private Integer quantity;
    private Double price;

    public GetDetailsDTO() {
    }
    public GetDetailsDTO(Details details){
        this.id = details.getId();
        this.name = name;
        this.productId = details.getProductId();
        this.quantity = details.getQuantity();
        this.price = details.getPrice();
    }

    public Long getId() {
        return id;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

}
