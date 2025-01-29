package com.microservices.carrito.carrito;

import com.microservices.carrito.carrito.model.Cart;
import com.microservices.carrito.carrito.model.Details;
import com.microservices.carrito.carrito.repository.CartRepository;
import com.microservices.carrito.carrito.repository.DetailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CarritoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarritoApplication.class, args);
	}
}
