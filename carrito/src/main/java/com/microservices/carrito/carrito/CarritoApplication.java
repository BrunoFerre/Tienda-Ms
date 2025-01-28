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
	/*@Bean
	public CommandLineRunner initData(CartRepository cartRepository, DetailsRepository detailsRepository){
		return (args) -> {
			Cart cart = new Cart();
			cartRepository.save(cart);
			Details details1 = new Details(4L,3,1.000);
			details1.setCart(cart);
			detailsRepository.save(details1);
			Details details2 = new Details(5L,2,200.00);
			details2.setCart(cart);
			detailsRepository.save(details2);
			cart.addDetails(details1);
			cart.setUserId(1L);
			Number total = details1.getPrice()*details1.getQuantity() + details2.getPrice()*details2.getQuantity();
			cart.setTotal(total.doubleValue());
			cartRepository.save(cart);*/

	/*	};*/
/*	}*/

}
