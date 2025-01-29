package com.microservices.carrito.carrito.dto.gets;

import com.microservices.carrito.carrito.model.Cart;

import java.util.List;

public class CartAndProductsDTO {
    private Long id;
    private Long userId;
    private Double total;
    private List<GetProductDTO> products;

    public CartAndProductsDTO() {
    }
    public CartAndProductsDTO(Cart cart, List<GetProductDTO> products){
        this.id = cart.getId();
        this.userId = cart.getUserId();
        this.total = cart.getTotal();
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<GetProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<GetProductDTO> products) {
        this.products = products;
    }
}
