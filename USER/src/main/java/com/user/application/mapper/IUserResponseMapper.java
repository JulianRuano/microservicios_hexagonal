package com.user.application.mapper;

import com.user.application.dtos.UserResponseDto;
import com.user.domain.model.User;

public interface IUserResponseMapper {

    UserResponseDto toUserRequestDto(User user);  
}
