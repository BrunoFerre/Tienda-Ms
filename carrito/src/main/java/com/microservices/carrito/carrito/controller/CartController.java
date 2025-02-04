package com.microservices.carrito.carrito.controller;

import com.microservices.carrito.carrito.dto.AddProductDTO;
import com.microservices.carrito.carrito.dto.gets.CartAndProductsDTO;
import com.microservices.carrito.carrito.dto.gets.GetCartDTO;
import com.microservices.carrito.carrito.dto.gets.GetProductDTO;
import com.microservices.carrito.carrito.model.Cart;
import com.microservices.carrito.carrito.model.Details;
import com.microservices.carrito.carrito.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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
            cartService.createCard(userId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), null, 400);
        }
    }

    @PostMapping("/{id}/add-product")
    public ResponseEntity<Object> addProduct(@PathVariable("id") Long id, @RequestBody AddProductDTO addProductDTO) {
        try {
            cartService.addProduct(id, addProductDTO);
            return ResponseEntity.ok().body("Product Added");
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
    public ResponseEntity<Object> getDetails(@PathVariable("id") Long id) {
        try {
            Cart cart = cartService.getCartById(id);
            List<Details> details = cart.getDetails();
            List<Long> productIds = details.stream().map(Details::getProductId).toList();
            List<GetProductDTO> getProductDTOS = new ArrayList<>();
            int cont = 0;
            for (Long producto : productIds) {
                GetProductDTO product = cartService.getProduct(producto);
                product.setQuantity(details.get(cont).getQuantity());
                getProductDTOS.add(product);
                cont++;
            }
            CartAndProductsDTO cartAndProductsDTO = new CartAndProductsDTO(cart, getProductDTOS);
            return ResponseEntity.ok(cartAndProductsDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
