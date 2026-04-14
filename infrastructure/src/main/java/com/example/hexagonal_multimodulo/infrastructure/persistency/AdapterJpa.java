package com.example.hexagonal_multimodulo.infrastructure.persistency;

import com.example.hexagonal_multimodulo.domain.model.ProductoModel;
import com.example.hexagonal_multimodulo.domain.ports.out.ProductPortOut;
import org.springframework.stereotype.Component;

@Component
public class AdapterJpa implements ProductPortOut {
    @Override
    public ProductoModel createOut(ProductoModel productoModel) {
        return null;
    }

    @Override
    public ProductoModel findByIdOut(Long id) {
        return null;
    }

    @Override
    public ProductoModel updateByIdOut(Long id, ProductoModel productoModel) {
        return null;
    }

    @Override
    public ProductoModel deleteByIdOut(Long id) {
        return null;
    }
}
