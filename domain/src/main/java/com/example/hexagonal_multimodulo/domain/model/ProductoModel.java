package com.example.hexagonal_multimodulo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductoModel {
    private Long id;
    private String nombre;
    private Double precio;
    private Integer stock;
}
