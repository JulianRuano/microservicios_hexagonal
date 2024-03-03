package com.user.application.mapper;

import org.springframework.stereotype.Component;

import com.user.application.dtos.UserRequestDto;
import com.user.domain.model.User;

@Component
public class UserRequestMapperImpl implements IUserRequestMapper{

    @Override
    public User toUser(UserRequestDto userRequestDto) {
       if (userRequestDto == null) {
           return null;
       }
        return User.builder()
            .name(userRequestDto.getName())
            .email(userRequestDto.getEmail())
            .password(userRequestDto.getPassword())
            .build();
    }
    
}
