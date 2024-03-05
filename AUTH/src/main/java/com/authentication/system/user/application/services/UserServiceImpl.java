package com.authentication.system.user.application.services;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.role.Role;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.role.UserRole;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.user.UserEntity;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.repository.IRoleRepository;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.repository.IUserRepository;


import lombok.NonNull;

import com.authentication.system.auth.application.service.JwtService;
import com.authentication.system.auth.infrastructure.api.controller.auth.AuthResponse;


@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private IRoleRepository roleRepository;

	@Autowired
	private  JwtService jwtService;


	@Override
	public AuthResponse saveUser(UserEntity user,Set<UserRole> userRoles) throws Exception {

		Optional<UserEntity> userLocal = userRepository.findByUsername(user.getUsername());	
		if(userLocal != null) {
			System.out.println("El usuario ya existe");
			throw new Exception("El usuario ya está presente");
		}
		else {
			for(UserRole userRole:userRoles) {
				Role role = userRole.getRole();
				if (role != null) { 
					roleRepository.save(role);
				}				
			}
			user.getUserRoles().addAll(userRoles);
			userRepository.save(user);
		}
		return AuthResponse.builder()
				.token(jwtService.getToken(user))
				.build();

	}

	@Override
	public UserEntity getUser(String username) {
		Optional<UserEntity> user = userRepository.findByUsername(username);
		return user.orElse(null);
	}

	@Override
	public void deleteUser(@NonNull Long id) {
		userRepository.deleteById(id);	
	}


	
	
}
