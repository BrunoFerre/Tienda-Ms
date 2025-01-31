package com.microservices.ventas.ventas.repository;

import com.microservices.ventas.ventas.dto.GetSaleDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cart-service", url = "http://localhost:8088")
public interface ApiCart {
    @GetMapping("/cart/exists")
    public boolean existsCart(@RequestParam("cartId") Long cartId);
    @GetMapping("/cart/{id}/details")
    public GetSaleDTO getCart(@RequestParam("id") Long id);
}
