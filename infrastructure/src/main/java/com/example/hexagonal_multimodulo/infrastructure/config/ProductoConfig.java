package com.example.hexagonal_multimodulo.infrastructure.config;

import com.example.hexagonal_multimodulo.application.service.ProductService;
import com.example.hexagonal_multimodulo.domain.ports.in.ProductoPortIn;
import com.example.hexagonal_multimodulo.domain.ports.out.ProductPortOut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductoConfig {

    @Bean
    ProductoPortIn productoPortIn(ProductPortOut productPortOut) {
        return new ProductService(productPortOut);
    }
}
