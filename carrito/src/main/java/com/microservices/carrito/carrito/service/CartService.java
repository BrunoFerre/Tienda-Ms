package com.microservices.carrito.carrito.service;

import com.microservices.carrito.carrito.dto.AddProductDTO;
import com.microservices.carrito.carrito.dto.gets.GetCartDTO;
import com.microservices.carrito.carrito.dto.gets.GetProductDTO;
import com.microservices.carrito.carrito.model.Cart;

public interface CartService {
    GetCartDTO getCart(Long cartId);

    Cart getCartById(Long cartId);

    void createCard(Cart cart);

    GetProductDTO getProduct(Long productId);

    void addProduct(Long cartId, AddProductDTO addProductDTO);

    boolean existsCart(Long cartId);
}
