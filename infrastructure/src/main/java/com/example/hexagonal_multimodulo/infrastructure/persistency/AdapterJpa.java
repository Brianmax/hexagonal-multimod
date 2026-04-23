package com.example.hexagonal_multimodulo.infrastructure.persistency;

import com.example.hexagonal_multimodulo.domain.model.ProductoModel;
import com.example.hexagonal_multimodulo.domain.ports.out.ProductPortOut;
import com.example.hexagonal_multimodulo.infrastructure.persistency.entity.ProductoEntity;
import com.example.hexagonal_multimodulo.infrastructure.persistency.repository.ProductoRepository;
import org.springframework.stereotype.Component;

@Component
public class AdapterJpa implements ProductPortOut {
    private final ProductoRepository productoRepository;
    public AdapterJpa(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public ProductoModel createOut(ProductoModel productoModel) {
        ProductoEntity productoEntity = new ProductoEntity();
        productoEntity.setPrecio(productoModel.getPrecio());
        productoEntity.setNombre(productoModel.getNombre());
        productoEntity.setStock(productoModel.getStock());
        productoRepository.save(productoEntity);

        return new ProductoModel(
                productoEntity.getId(),
                productoEntity.getNombre(),
                productoEntity.getPrecio(),
                productoEntity.getStock());
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
