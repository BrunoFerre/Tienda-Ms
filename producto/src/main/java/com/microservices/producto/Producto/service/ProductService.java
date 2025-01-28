package com.microservices.producto.Producto.service;

import com.microservices.producto.Producto.dto.GetProductDTO;
import com.microservices.producto.Producto.model.Product;

import java.util.List;

public interface ProductService {
    List<GetProductDTO> getAllProducts();

    GetProductDTO getProductDTO(Long id);

    Boolean existProduct(Long id);
}
