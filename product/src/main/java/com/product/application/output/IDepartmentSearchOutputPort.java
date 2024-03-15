package com.product.application.output;

import com.product.domain.models.Department;

public interface IDepartmentSearchOutputPort {
    Department getByID(Long id);
}
