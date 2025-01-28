package com.microservices.producto.Producto.service.impl;

import com.microservices.producto.Producto.dto.GetProductDTO;
import com.microservices.producto.Producto.model.Product;
import com.microservices.producto.Producto.repository.ProductRepository;
import com.microservices.producto.Producto.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<GetProductDTO> getAllProducts() {
        return getProducts().stream().map(GetProductDTO::new).toList();
    }

    @Override
    public GetProductDTO getProductDTO(Long id) {
        return new GetProductDTO(getProductById(id));
    }

    @Override
    public Boolean existProduct(Long id) {
        return productRepository.existsById(id);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

}
