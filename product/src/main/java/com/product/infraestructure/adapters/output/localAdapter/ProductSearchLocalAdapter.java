package com.product.infraestructure.adapters.output.localAdapter;

import org.springframework.stereotype.Component;

import com.product.application.output.IProductSearchOutput;
import com.product.domain.models.Product;

@Component("ProductSearchLocalAdapter")
public class ProductSearchLocalAdapter implements IProductSearchOutput {

    @Override
    public Product getProductById(Long id) {
        Product product = new Product();
        product.setId(id);
        product.setName("Coca Cola");
        product.setDescription("Bebida gaseosa");

        return product;

    }
    
}
