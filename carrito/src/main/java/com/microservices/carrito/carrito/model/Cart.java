package com.microservices.carrito.carrito.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "cart", fetch = FetchType.EAGER)
    private List<Details> details = new ArrayList<>();
    private Double total;
    private Long userId;

    public Cart() {
    }

    public Cart(Double total, Long userId) {
        this.total = total;
        this.userId = userId;
    }

    public void addDetails(Details details) {
        details.setCart(this);
        this.details.add(details);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Details> getDetails() {
        return details;
    }

    public void setDetails(List<Details> details) {
        this.details = details;
    }
}
