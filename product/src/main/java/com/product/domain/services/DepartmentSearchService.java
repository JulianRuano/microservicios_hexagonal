package com.product.domain.services;

import org.springframework.stereotype.Service;

import com.product.application.input.IDepartmentSearchManagerPort;
import com.product.application.output.IDepartmentSearchOutputPort;
import com.product.domain.models.Department;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentSearchService implements IDepartmentSearchManagerPort{

    private final IDepartmentSearchOutputPort departmentSearchOutputPort;

    @Override
    public Department getByIDepartment(Long id) {
        return departmentSearchOutputPort.getByID(id);
    }
}
