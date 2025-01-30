package com.microservices.ventas.ventas.repository;

import com.microservices.ventas.ventas.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
    Sale getByCartId(Long id);
}
