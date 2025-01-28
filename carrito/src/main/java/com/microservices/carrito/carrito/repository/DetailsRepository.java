package com.microservices.carrito.carrito.repository;

import com.microservices.carrito.carrito.model.Cart;
import com.microservices.carrito.carrito.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Long> {
    List<Details> findByCart(Cart cart);
}
