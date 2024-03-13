package com.product.infraestructure.adapters.input.rest.data.response;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductGetByIdResponse {
    private Long id;
    private String name;
    private String description; 
}
