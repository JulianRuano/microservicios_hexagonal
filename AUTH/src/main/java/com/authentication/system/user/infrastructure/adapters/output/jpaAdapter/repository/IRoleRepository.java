package com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.role.Role;

public interface IRoleRepository extends JpaRepository<Role, Long>{

}
