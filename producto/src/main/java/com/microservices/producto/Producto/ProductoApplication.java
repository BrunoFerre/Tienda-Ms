package com.microservices.producto.Producto;

import com.microservices.producto.Producto.model.Product;
import com.microservices.producto.Producto.repository.ProductRepository;
import com.microservices.producto.Producto.utils.GenerateNumber;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductoApplication.class, args);
    }

   /* @Bean
    public CommandLineRunner initData(ProductRepository productoRepository) {
        return (args) -> {
            productoRepository.save(new Product("PR" + GenerateNumber.getRandomNumber(0, 1000), "Laptop", "HP", 1000.0));
            productoRepository.save(new Product("PR" + GenerateNumber.getRandomNumber(0, 1000), "Mouse", "Logitech", 20.0));
            productoRepository.save(new Product("PR" + GenerateNumber.getRandomNumber(0, 1000), "Keyboard", "Genius", 30.0));
            productoRepository.save(new Product("PR" + GenerateNumber.getRandomNumber(0, 1000), "Monitor", "Samsung", 200.0));
            productoRepository.save(new Product("PR" + GenerateNumber.getRandomNumber(0, 1000), "Tablet", "Apple", 800.0));
            productoRepository.save(new Product("PR" + GenerateNumber.getRandomNumber(0, 1000), "Smartphone", "Samsung", 700.0));
        };
    }*/

}
