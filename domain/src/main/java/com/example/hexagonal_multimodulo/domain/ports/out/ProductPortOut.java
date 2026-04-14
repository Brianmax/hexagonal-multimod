package com.example.hexagonal_multimodulo.domain.ports.out;

import com.example.hexagonal_multimodulo.domain.model.ProductoModel;

public interface ProductPortOut {
    ProductoModel createOut(ProductoModel productoModel);
    ProductoModel findByIdOut(Long id);
    ProductoModel updateByIdOut(Long id, ProductoModel productoModel);
    ProductoModel deleteByIdOut(Long id);
}
