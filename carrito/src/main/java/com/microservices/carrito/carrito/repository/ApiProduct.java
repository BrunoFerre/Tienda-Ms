package com.microservices.carrito.carrito.repository;

import com.microservices.carrito.carrito.dto.gets.GetProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "http://localhost:8090")
public interface ApiProduct {
    @GetMapping("/products/{id}")
    public GetProductDTO getProduct(@PathVariable("id") Long id);

    @GetMapping("/products/exist/{id}")
    public boolean existProduct(@PathVariable("id") Long id);
}
