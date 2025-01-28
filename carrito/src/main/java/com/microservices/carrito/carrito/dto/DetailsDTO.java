package com.microservices.carrito.carrito.dto;

public class DetailsDTO {
    private Long id;
    private String productName;
    private Long productId;
    private Integer quantity;
    private Double price;

    public DetailsDTO() {
    }

    public DetailsDTO(Long id, String productName, Long productId, Integer quantity, Double price) {
        this.id = id;
        this.productName = productName;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
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
