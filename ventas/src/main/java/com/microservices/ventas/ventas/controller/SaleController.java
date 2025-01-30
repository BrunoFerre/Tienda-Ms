package com.microservices.ventas.ventas.controller;

import com.microservices.ventas.ventas.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getSaleById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(saleService.getSaleById(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<Object> requestSave(@RequestParam Long cartId) {
        try {
            saleService.saveSale(cartId);
            return ResponseEntity.ok("Sale created");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
