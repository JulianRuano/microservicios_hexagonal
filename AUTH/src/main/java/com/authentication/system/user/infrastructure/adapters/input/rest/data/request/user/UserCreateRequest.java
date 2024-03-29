package com.authentication.system.user.infrastructure.adapters.input.rest.data.request.user;

import com.authentication.system.user.domain.models.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateRequest {
    private String username;
    private String password;   
    private String name;
    private String email;
    private String profile;

    private Role role;
}
