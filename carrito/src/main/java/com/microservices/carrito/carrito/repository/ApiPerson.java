package com.microservices.carrito.carrito.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "person-service", url = "http://localhost:7880")
public interface ApiPerson {
    @GetMapping("/person/exist")
    boolean existPerson(@RequestParam("id") Long id);
}
