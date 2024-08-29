package com.product.domain.models.services;

import org.springframework.stereotype.Service;

import com.product.application.input.IProductCreateManagerPort;
import com.product.application.output.IProductCreateOutputPort;
import com.product.domain.models.Product;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService implements IProductCreateManagerPort {

    private final IProductCreateOutputPort outputPort;

    @Override
    public Product createProduct(Product product) {
        return outputPort.createProduct(product);
    }
    
}
