package com.product.infraestructure.adapters.input.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.application.input.IProductCreateManagerPort;
import com.product.application.input.IProductSearchManagerPort;
import com.product.domain.models.Product;
import com.product.infraestructure.adapters.input.rest.data.request.ProductCreateRequest;
import com.product.infraestructure.adapters.input.rest.data.response.ProductGetByIdResponse;
import com.product.infraestructure.adapters.input.rest.mapper.IProductRestMapper;

import lombok.AllArgsConstructor;

@RequestMapping("/product")
@RestController
@AllArgsConstructor
public class ProductController {

    private final IProductRestMapper productRestMapper;
    private final IProductCreateManagerPort productCreateManagerPort;
    private final IProductSearchManagerPort productSearchManagerPort;

    @GetMapping("/{id}")
    public ResponseEntity<ProductGetByIdResponse> getProductById(@PathVariable Long id) {
        ProductGetByIdResponse personGetByIdResponse = productRestMapper.toByIdResponse(productSearchManagerPort.getProductById(id));
        return ResponseEntity.ok(personGetByIdResponse);
    }

    @PostMapping("/")
    public ResponseEntity<ProductGetByIdResponse> createProduct(@RequestBody ProductCreateRequest productCreateRequest) {
        Product product = productCreateManagerPort.createProduct(productRestMapper.toProduct(productCreateRequest));
        ProductGetByIdResponse productGetByIdResponse = productRestMapper.toByIdResponse(product);
        return ResponseEntity.ok(productGetByIdResponse);
    }
    
}
