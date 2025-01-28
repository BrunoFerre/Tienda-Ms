package com.microservices.carrito.carrito.controller;

import com.microservices.carrito.carrito.dto.AddProductDTO;
import com.microservices.carrito.carrito.dto.CartDTO;
import com.microservices.carrito.carrito.dto.GetCartDTO;
import com.microservices.carrito.carrito.model.Cart;
import com.microservices.carrito.carrito.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getCartById(@PathVariable("id") Long id) {
        try {
            GetCartDTO cart = cartService.getCart(id);
            return ResponseEntity.ok(cart);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<Object> createCart(@RequestParam Long userId) {
        try {
            Cart cart = new Cart(0.0, userId);
            cartService.createCard(cart);
            return ResponseEntity.ok(cart);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/{id}/add-product")
    public ResponseEntity<Object> addProduct(@PathVariable("id") Long id, @RequestBody AddProductDTO addProductDTO) {
        try {
            cartService.addProduct(id, addProductDTO);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/exists")
    public ResponseEntity<Object> existsCart(@RequestParam Long cartId) {
        try {
            boolean exists = cartService.existsCart(cartId);
            return ResponseEntity.ok(exists);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<Object> getCartComplete(@PathVariable("id") Long id) {
        try {
            CartDTO cart = cartService.getCart(id);
            return ResponseEntity.ok(cart.getDetails());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
