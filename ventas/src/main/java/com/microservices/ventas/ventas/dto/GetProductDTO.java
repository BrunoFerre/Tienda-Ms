package com.microservices.ventas.ventas.dto;

public class GetProductDTO {
    private Long id;
    private String number;
    private String name, brand;
    private double price;

    public GetProductDTO() {
    }

    public GetProductDTO(Long id, String number, String name, String brand, double price) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.brand = brand;
        this.price = price;
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
}
