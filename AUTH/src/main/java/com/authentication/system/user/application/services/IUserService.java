package com.authentication.system.user.application.services;

import java.util.Set;

import com.authentication.system.auth.infrastructure.api.controller.auth.AuthResponse;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.role.UserRole;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.user.UserEntity;

public interface IUserService {
	public AuthResponse saveUser(UserEntity user,Set<UserRole> userRole) throws Exception;

	public UserEntity getUser(String username);

	public void deleteUser(Long id);
}
