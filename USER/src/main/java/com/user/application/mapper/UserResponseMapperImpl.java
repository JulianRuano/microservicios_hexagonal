package com.user.application.mapper;

import org.springframework.stereotype.Component;

import com.user.application.dtos.UserResponseDto;
import com.user.domain.model.User;

@Component
public class UserResponseMapperImpl implements IUserResponseMapper{

    @Override
    public UserResponseDto toUserRequestDto(User user) {
        if (user == null) {
            return null;
        }
        return UserResponseDto.builder()
            .id(user.getId())
            .name(user.getName())
            .email(user.getEmail())
            .build();
    }
    
}
