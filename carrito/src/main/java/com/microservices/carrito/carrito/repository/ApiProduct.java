package com.microservices.carrito.carrito.repository;

import com.microservices.carrito.carrito.dto.GetProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "http://localhost:8090")
public interface ApiProduct {
    @GetMapping("/product/{id}")
    public GetProductDTO getProduct(@PathVariable("id") Long id);

    @GetMapping("/product/exist/{id}")
    public boolean existProduct(@PathVariable("id") Long id);
}
