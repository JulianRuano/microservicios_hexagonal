package com.product.infraestructure.adapters.output.jpaAdapter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.infraestructure.adapters.output.jpaAdapter.entity.DepartmentEntity;

public interface IDepartmentRepository extends JpaRepository<DepartmentEntity, Long>{
    
}
