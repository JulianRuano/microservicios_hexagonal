package com.product.infraestructure.adapters.output.jpaAdapter;

import org.springframework.stereotype.Component;

import com.product.application.output.IProductSearchOutput;
import com.product.domain.models.Product;
import com.product.infraestructure.adapters.output.jpaAdapter.mapper.IProductMapper;
import com.product.infraestructure.adapters.output.jpaAdapter.repository.IProductRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ProductSearchJpaAdapter implements IProductSearchOutput {

    private final IProductRepository productRepository;
    private final IProductMapper productMapper;


    @Override
    public Product getProductById(Long id) {
        return productMapper.toDomain(productRepository.findById(id).get());
    }
    
}
