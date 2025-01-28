package com.microservices.carrito.carrito.dto;

import java.util.List;

public class CartDTO {
    private Long id;
    private List<DetailsDTO> details;
    private Double total;

    public CartDTO() {
    }

    public CartDTO(Long id, List<DetailsDTO> details, Double total) {
        this.id = id;
        this.details = details;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public List<DetailsDTO> getDetails() {
        return details;
    }

    public Double getTotal() {
        return total;
    }
}
