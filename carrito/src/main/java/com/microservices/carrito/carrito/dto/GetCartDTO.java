package com.microservices.carrito.carrito.dto;

import com.microservices.carrito.carrito.model.Cart;
import java.util.List;

public class GetCartDTO {
    private Long id;
    private List<GetDetailsDTO> details;
    private Double total;
    private Long userId;

    public GetCartDTO() {
    }

    public GetCartDTO(Cart cart) {
        this.id = cart.getId();
        this.details = cart.getDetails().stream().map(GetDetailsDTO::new).toList();
        this.total = cart.getTotal();
        this.userId = cart.getUserId();
    }

    public Long getId() {
        return id;
    }

    public List<GetDetailsDTO> getDetails() {
        return details;
    }

    public Double getTotal() {
        return total;
    }

    public Long getUserId() {
        return userId;
    }
}
