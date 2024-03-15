package com.product.infraestructure.adapters.input.rest.data.response;

import java.util.List;

import com.product.infraestructure.adapters.input.rest.data.dto.CityDto;

import lombok.Data;

@Data
public class DepartamentGetByIdResponse {
    private Long id;
    private String name;
    private List<CityDto> cities;  
}
