package com.product.infraestructure.adapters.output.jpaAdapter;

import org.springframework.stereotype.Component;

import com.product.application.output.IDepartmentSearchOutputPort;
import com.product.domain.models.Department;
import com.product.infraestructure.adapters.output.jpaAdapter.mapper.IDepartmentMapper;
import com.product.infraestructure.adapters.output.jpaAdapter.repository.IDepartmentRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class DepartmentSearchJpaAdapter implements IDepartmentSearchOutputPort{

    private final IDepartmentRepository departmentRepository;
    private final IDepartmentMapper departmentMapper;
    
    @Override
    public Department getByID(Long id) {
        return departmentMapper.toDomain(departmentRepository.findById(id).get());
    }
}
