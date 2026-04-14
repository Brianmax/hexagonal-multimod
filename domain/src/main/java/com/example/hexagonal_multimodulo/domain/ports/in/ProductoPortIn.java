package com.example.hexagonal_multimodulo.domain.ports.in;

import com.example.hexagonal_multimodulo.domain.model.ProductoModel;

public interface ProductoPortIn {
    ProductoModel createIn(ProductoModel productoModel);
    ProductoModel findByIdIn(Long id);
    ProductoModel updateByIdIn(Long id, ProductoModel productoModel);
    ProductoModel deleteByIdIn(Long id);
}
