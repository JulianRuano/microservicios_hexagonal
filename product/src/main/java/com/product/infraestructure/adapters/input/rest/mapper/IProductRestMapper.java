package com.product.infraestructure.adapters.input.rest.mapper;

import org.mapstruct.Mapper;

import com.product.domain.models.Product;
import com.product.infraestructure.adapters.input.rest.data.request.ProductCreateRequest;
import com.product.infraestructure.adapters.input.rest.data.response.ProductGetByIdResponse;

@Mapper
public interface IProductRestMapper {
    Product toProduct(ProductCreateRequest productCreateRequest);
    ProductCreateRequest toProductCreate(Product product);

    ProductGetByIdResponse toByIdResponse(Product product);
   
}
