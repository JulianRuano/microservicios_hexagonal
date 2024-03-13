package com.product.domain.services;

import org.springframework.stereotype.Service;

import com.product.application.input.IProductSearchManagerPort;
import com.product.application.output.IProductSearchOutput;
import com.product.domain.models.Product;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductSearchService implements IProductSearchManagerPort {

    private final IProductSearchOutput outputPort;

    @Override
    public Product getProductById(Long id) {
        return outputPort.getProductById(id);
    }
    
}
