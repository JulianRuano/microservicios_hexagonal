package com.product.application.input;

import com.product.domain.models.Product;

public interface IProductSearchManagerPort {
    Product getProductById(Long id);
}
