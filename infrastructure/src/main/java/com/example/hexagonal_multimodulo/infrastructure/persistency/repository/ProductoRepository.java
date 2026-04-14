package com.example.hexagonal_multimodulo.infrastructure.persistency.repository;

import com.example.hexagonal_multimodulo.infrastructure.persistency.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {
}
