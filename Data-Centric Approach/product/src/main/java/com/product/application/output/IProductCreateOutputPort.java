package com.product.application.output;

import com.product.domain.models.Product;

public interface IProductCreateOutputPort {

    Product createProduct(Product product);
}
