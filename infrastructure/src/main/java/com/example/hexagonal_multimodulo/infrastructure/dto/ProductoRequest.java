package com.example.hexagonal_multimodulo.infrastructure.dto;

import com.example.hexagonal_multimodulo.domain.model.ProductoModel;
import com.example.hexagonal_multimodulo.infrastructure.persistency.entity.ProductoEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoRequest {
    private String nombre;
    private Double precio;
    private Integer stock;

    public ProductoModel toDomain() {
        return new ProductoModel(null, this.nombre, this.precio, this.stock);
    }
}
