package com.microservices.carrito.carrito.service.impl;

import com.microservices.carrito.carrito.dto.AddProductDTO;
import com.microservices.carrito.carrito.dto.gets.GetCartDTO;
import com.microservices.carrito.carrito.dto.gets.GetProductDTO;
import com.microservices.carrito.carrito.model.Cart;
import com.microservices.carrito.carrito.model.Details;
import com.microservices.carrito.carrito.repository.ApiProduct;
import com.microservices.carrito.carrito.repository.CartRepository;
import com.microservices.carrito.carrito.repository.DetailsRepository;
import com.microservices.carrito.carrito.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ApiProduct apiProduct;
    @Autowired
    private DetailsRepository detailsRepository;

    @Override
    public GetCartDTO getCart(Long cartId) {
        return new GetCartDTO(getCartById(cartId));
    }

    @Override
    public Cart getCartById(Long cartId) {
        return cartRepository.getById(cartId);
    }

    @Override
    public void createCard(Cart cart) {
        cartRepository.save(cart);
    }

    public boolean existProduct(Long productId) {
        return apiProduct.existProduct(productId);
    }

    @Override
    public GetProductDTO getProduct(Long productId) {
        return apiProduct.getProduct(productId);
    }

    @Override
    public void addProduct(Long cartId, AddProductDTO addProductDTO) {
        Cart cart = getCartById(cartId);
        if (existProduct(addProductDTO.getProductId())) {
            GetProductDTO product = getProduct(addProductDTO.getProductId());
            Details details = new Details(product.getId(), addProductDTO.getQuantity(), product.getPrice());
            details.setCart(cart);
            detailsRepository.save(details);
            Double total = product.getPrice() * addProductDTO.getQuantity();
            System.out.println(total);
            cart.setTotal(cart.getTotal() + total);
            cartRepository.save(cart);
        } else {
            throw new RuntimeException("Product not found");
        }
    }

    @Override
    public boolean existsCart(Long cartId) {
        return cartRepository.existsById(cartId);
    }
}