package com.authentication.system.user.infrastructure.adapters.input.rest;

import java.util.Set;

import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.role.UserRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    String username;
    String password;
    String name;
    String email;
    @Builder.Default
    boolean enabled = true;
    @Builder.Default
    String profile = "default.png"; 
    Set<UserRole> roles;
}
