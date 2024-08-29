package com.product.application.input;

import com.product.domain.models.Product;

public interface IProductCreateManagerPort {

    Product createProduct(Product product);
    
}
