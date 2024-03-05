package com.authentication.system.auth.application.service;

import org.springframework.stereotype.Service;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.authentication.system.auth.infrastructure.api.controller.auth.AuthResponse;
import com.authentication.system.auth.infrastructure.api.controller.auth.LoginRequest;
import com.authentication.system.auth.infrastructure.api.controller.auth.RegisterRequest;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.user.UserEntity;
import com.authentication.system.auth.infrastructure.exceptions.UserFoundException;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.repository.IUserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final IUserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

     public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserEntity user=userRepository.findByUsername(request.getUsername()).orElseThrow();
        String token=jwtService.getToken(user);
        return AuthResponse.builder()
            .token(token)
            .build();

    }

    public AuthResponse register(RegisterRequest request) throws UserFoundException {

        //verificar si el usuario existe y request no es nulo
        UserEntity userExists = userRepository.findByUsername(request.getUsername()).orElse(null);
        if (userExists != null) {
            throw new UserFoundException();
        }     
        UserEntity user = UserEntity.builder()
        .username(request.getUsername())
        .password(passwordEncoder.encode( request.getPassword()))
        .name(request.getName())
        .email(request.getEmail())
        .cellPhone(request.getCellPhone())
        .enabled(request.isEnabled())
        .profile(request.getProfile())
        .build();

        if (user != null) {
            userRepository.save(user);
        }

        return AuthResponse.builder()
            .token(jwtService.getToken(user))
            .build();
        
    }

    //obtener usuaruio del token
    public UserEntity getCurrentUser(String authorizationHeader) {
        String token = authorizationHeader.substring(7);  
        String username = jwtService.getUsernameFromToken(token);
        
        return userRepository.findByUsername(username).orElse(null);      
    }
 


}