package com.example.hexagonal_multimodulo.infrastructure.controller;

import com.example.hexagonal_multimodulo.domain.model.ProductoModel;
import com.example.hexagonal_multimodulo.domain.ports.in.ProductoPortIn;
import com.example.hexagonal_multimodulo.infrastructure.dto.ProductoRequest;
import com.example.hexagonal_multimodulo.infrastructure.dto.ProductoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/api/v1/producto")
public class ProductoController {
    private final ProductoPortIn productoPortIn;

    public ProductoController(ProductoPortIn productoPortIn) {
        this.productoPortIn = productoPortIn;
    }

    @PostMapping("/save")
    public ResponseEntity<ProductoResponse> create(@RequestBody ProductoRequest productoRequest) {
        ProductoModel producto = productoPortIn.createIn(productoRequest.toDomain());
        return ResponseEntity.ok(ProductoResponse.fromDomain(producto));
    }
}
