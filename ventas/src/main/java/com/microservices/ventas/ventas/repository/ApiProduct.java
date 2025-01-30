package com.microservices.ventas.ventas.repository;

import com.microservices.ventas.ventas.dto.GetProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "http://localhost:8090")
public interface ApiProduct {
    @GetMapping("/products/{id}")
    public GetProductDTO getProductById(@PathVariable("id") Long id);
}
