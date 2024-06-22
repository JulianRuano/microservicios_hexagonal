package com.product.infraestructure.adapters.output.jpaAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.product.application.output.IProductSearchOutput;
import com.product.domain.models.Product;
import com.product.infraestructure.adapters.output.jpaAdapter.mapper.IProductMapper;
import com.product.infraestructure.adapters.output.jpaAdapter.repository.IProductRepository;


@Component("ProductSearchJpaAdapter")
public class ProductSearchJpaAdapter implements IProductSearchOutput {

    @Autowired
    private IProductRepository productRepository;
    
    @Autowired
    private IProductMapper productMapper;

    @Override
    public Product getProductById(Long id) {
        return productMapper.toDomain(productRepository.findById(id).get());
    }
    
}
