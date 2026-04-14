package com.example.hexagonal_multimodulo.infrastructure.dto;

import com.example.hexagonal_multimodulo.domain.model.ProductoModel;
import com.example.hexagonal_multimodulo.infrastructure.persistency.entity.ProductoEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoResponse {
    private Long id;
    private String nombre;
    private Double precio;
    private Integer stock;


    public static ProductoResponse fromDomain(ProductoModel producto) {
        ProductoResponse response = new ProductoResponse();
        response.setId(producto.getId());
        response.setNombre(producto.getNombre());
        response.setPrecio(producto.getPrecio());
        response.setStock(producto.getStock());
        return response;
    }
}
