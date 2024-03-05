package com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.user.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {
	
	Optional<UserEntity> findByUsername(String username); 

}
