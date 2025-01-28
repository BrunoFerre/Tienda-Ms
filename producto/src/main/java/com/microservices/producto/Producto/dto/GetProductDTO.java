package com.microservices.producto.Producto.dto;


import com.microservices.producto.Producto.model.Product;

public class GetProductDTO {
    private Long id;
    private String number;
    private String name, brand;
    private double price;

    public GetProductDTO() {
    }

    public GetProductDTO(Product product) {
        this.id = product.getId();
        this.number = product.getNumber();
        this.name = product.getName();
        this.brand = product.getBrand();
        this.price = product.getPrice();
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
