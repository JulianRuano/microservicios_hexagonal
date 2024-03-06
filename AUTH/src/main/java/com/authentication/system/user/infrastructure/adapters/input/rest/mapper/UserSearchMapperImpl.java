package com.authentication.system.user.infrastructure.adapters.input.rest.mapper;

import org.springframework.stereotype.Component;

import com.authentication.system.user.domain.models.User;
import com.authentication.system.user.infrastructure.adapters.input.rest.data.response.user.UserGetResponse;

@Component
public class UserSearchMapperImpl implements IUserSearchMapper {

    @Override
    public User toUser(UserGetResponse userGetResponse) {
        return User.builder()
                .id(userGetResponse.getId())
                .username(userGetResponse.getUsername())
                .name(userGetResponse.getName())
                .email(userGetResponse.getEmail())
                .role(userGetResponse.getRole())
                .build();
    }

    @Override
    public UserGetResponse toUserGetResponse(User user) {
        return UserGetResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .name(user.getName())
                .email(user.getEmail())
                .role(user.getRole())
                .build();
    }


    
}
