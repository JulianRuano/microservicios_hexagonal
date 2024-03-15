package com.product.application.input;

import com.product.domain.models.Department;

public interface IDepartmentSearchManagerPort {
    Department getByIDepartment(Long id);
}
