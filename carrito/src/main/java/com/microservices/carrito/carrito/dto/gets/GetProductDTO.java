package com.microservices.carrito.carrito.dto.gets;

public class GetProductDTO {
    private Long id;
    private String number;
    private String name, brand;
    private double price;
    private Integer quantity;

    public GetProductDTO() {
    }

    public GetProductDTO(Long id, String number, String name, String brand, double price, Integer quantity) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
