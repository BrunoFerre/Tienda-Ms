package com.microservices.ventas.ventas.dto;

public class GetProductDTO {
    private Long id;
    private String number;
    private String name, brand;
    private double price;
    private int quantity;

    public GetProductDTO() {
    }

    public GetProductDTO(Long id, String number, String name, String brand, double price, int quantity) {
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

    public int getQuantity() {
        return quantity;
    }
}
