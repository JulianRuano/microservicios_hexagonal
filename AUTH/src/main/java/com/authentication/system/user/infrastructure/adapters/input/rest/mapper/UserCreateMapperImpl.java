package com.authentication.system.user.infrastructure.adapters.input.rest.mapper;

import org.springframework.stereotype.Component;

import com.authentication.system.user.domain.models.User;
import com.authentication.system.user.infrastructure.adapters.input.rest.data.request.user.UserCreateRequest;
import com.authentication.system.user.infrastructure.adapters.input.rest.data.response.user.UserCreateResponse;

import lombok.NonNull;

@Component
public class UserCreateMapperImpl implements IUserCreateMapper{

    @Override
    public User toUser(@NonNull UserCreateRequest userCreateRequest) {
        return User.builder()
                .username(userCreateRequest.getUsername())
                .password(userCreateRequest.getPassword())
                .name(userCreateRequest.getName())
                .email(userCreateRequest.getEmail())
                .profile(userCreateRequest.getProfile())
                .role(userCreateRequest.getRole())
                .build();     
    }

    @Override
    public UserCreateRequest toUserCreateRequest(@NonNull User user) {
        return UserCreateRequest.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .name(user.getName())
                .email(user.getEmail())
                .profile(user.getProfile())
                .role(user.getRole())
                .build();
    }

    @Override
    public UserCreateResponse toUserCreateResponse(User user) {
        return UserCreateResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .name(user.getName())
                .email(user.getEmail())
                .role(user.getRole())
                .build();
    }

    @Override
    public User toUser(UserCreateResponse userCreateResponse) {
        return User.builder()
                .id(userCreateResponse.getId())
                .username(userCreateResponse.getUsername())
                .name(userCreateResponse.getName())
                .email(userCreateResponse.getEmail())
                .role(userCreateResponse.getRole())
                .build();
    }
    
}
