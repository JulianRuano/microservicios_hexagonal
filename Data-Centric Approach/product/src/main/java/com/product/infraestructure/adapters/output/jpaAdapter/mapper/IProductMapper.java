package com.product.infraestructure.adapters.output.jpaAdapter.mapper;

import org.mapstruct.Mapper;

import com.product.domain.models.Product;
import com.product.infraestructure.adapters.output.jpaAdapter.entity.ProductEntity;

@Mapper
public interface IProductMapper {

    Product toDomain(ProductEntity productEntity);
    ProductEntity toEntity(Product product);
}
