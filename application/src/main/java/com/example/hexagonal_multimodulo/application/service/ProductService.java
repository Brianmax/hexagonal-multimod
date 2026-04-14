package com.example.hexagonal_multimodulo.application.service;

import com.example.hexagonal_multimodulo.domain.model.ProductoModel;
import com.example.hexagonal_multimodulo.domain.ports.in.ProductoPortIn;
import com.example.hexagonal_multimodulo.domain.ports.out.ProductPortOut;

public class ProductService implements ProductoPortIn {
    private final ProductPortOut productPortOut;

    public ProductService(ProductPortOut productPortOut) {
        this.productPortOut = productPortOut;
    }

    @Override
    public ProductoModel createIn(ProductoModel productoModel) {
        // logica de negocio
        double precio = productoModel.getPrecio();
        double stock = productoModel.getStock();
        if(precio < 0) {
            throw new ArithmeticException("El precio no puede ser negativo");
        }

        if(stock < 10) {
            precio = precio * 1.10; // Aumentamos el precio en un 10% si el stock es menor a 10
            productoModel.setPrecio(precio);
        }
        // mas reglas de negocio
        // code
        // fin
        // guardamos en la base de datos
        return null;
    }

    @Override
    public ProductoModel findByIdIn(Long id) {
        return null;
    }

    @Override
    public ProductoModel updateByIdIn(Long id, ProductoModel productoModel) {
        return null;
    }

    @Override
    public ProductoModel deleteByIdIn(Long id) {
        return null;
    }
}
