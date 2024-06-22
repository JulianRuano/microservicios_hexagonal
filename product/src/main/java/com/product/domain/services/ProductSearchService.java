package com.product.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.product.application.input.IProductSearchManagerPort;
import com.product.application.output.IProductSearchOutput;
import com.product.domain.models.Product;

@Service
public class ProductSearchService implements IProductSearchManagerPort {


    @Autowired
    //@Qualifier("ProductSearchLocalAdapter") // inyectar el adaptador local
    @Qualifier("ProductSearchJpaAdapter") // inyectar el adaptador de JPA
    private IProductSearchOutput outputPort;

    @Override
    public Product getProductById(Long id) {
        return outputPort.getProductById(id);
    }
    
}
