package com.product.application.output;

import com.product.domain.models.Product;

public interface IProductSearchOutput {
    
    Product getProductById(Long id);
}
