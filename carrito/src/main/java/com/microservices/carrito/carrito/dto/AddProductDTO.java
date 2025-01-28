package com.microservices.carrito.carrito.dto;

public class AddProductDTO {
    private  Long userId;
    private Long productId;
    private Integer quantity;

    public AddProductDTO() {
    }

    public AddProductDTO(Long userId, Long productId, Integer quantity) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
