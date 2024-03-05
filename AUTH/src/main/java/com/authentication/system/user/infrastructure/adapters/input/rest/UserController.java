package com.authentication.system.user.infrastructure.adapters.input.rest;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.system.auth.infrastructure.api.controller.auth.AuthResponse;
import com.authentication.system.user.application.services.IUserService;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.role.Role;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.role.UserRole;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.user.UserEntity;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/")
    public ResponseEntity<AuthResponse>  saveUser(UserRequest userRequest) throws Exception {
        Set<UserRole> roles = new HashSet<>();

        UserEntity user = UserEntity.builder()
                .username(userRequest.getUsername())
                .password(passwordEncoder.encode(userRequest.getPassword()))
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .enabled(userRequest.isEnabled())
                .profile(userRequest.getProfile())

                .build();

        Role rol = new Role();
        rol.setRolId(userRequest.roles.iterator().next().getRole().getRolId());
        rol.setRolName(userRequest.roles.iterator().next().getRole().getRolName());

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(rol);

        roles.add(userRole);
  

        return ResponseEntity.ok(userService.saveUser(user, roles));
    }

    @GetMapping("/{username}")
    public UserEntity getUser(@PathVariable("username") String username) {
        return userService.getUser(username);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUser(userId);
    }
}
