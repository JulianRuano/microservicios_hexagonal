package com.product.infraestructure.adapters.output.jpaAdapter;

import org.springframework.stereotype.Component;

import com.product.application.output.IProductCreateOutputPort;
import com.product.domain.models.Product;
import com.product.infraestructure.adapters.output.jpaAdapter.entity.ProductEntity;
import com.product.infraestructure.adapters.output.jpaAdapter.mapper.IProductMapper;
import com.product.infraestructure.adapters.output.jpaAdapter.repository.IProductRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ProductCreateJpaAdapter implements IProductCreateOutputPort{

    private final IProductRepository productRepository;
    private final IProductMapper productMapper;

    @Override  
    public Product createProduct(Product product) {
        ProductEntity productEntity = productMapper.toEntity(product);
        productEntity = productRepository.save(productEntity);
        return productMapper.toDomain(productEntity);   
    }
}
