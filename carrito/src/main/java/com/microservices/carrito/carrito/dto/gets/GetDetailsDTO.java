package com.microservices.carrito.carrito.dto.gets;

import com.microservices.carrito.carrito.model.Details;

public class GetDetailsDTO {
    private Long id;
    private Long productId;
    private Integer quantity;
    private Double price;

    public GetDetailsDTO() {
    }
    public GetDetailsDTO(Details details){
        this.id = details.getId();
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
