package com.product.infraestructure.adapters.input.rest.mapper;

import org.mapstruct.Mapper;

import com.product.domain.models.Department;
import com.product.infraestructure.adapters.input.rest.data.response.DepartamentGetByIdResponse;

@Mapper
public interface IDepartamentRestMapper {
    DepartamentGetByIdResponse toResponse(Department department);
}
