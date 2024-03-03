package com.user.application.usecases;

import com.user.application.dtos.UserResponseDto;
import com.user.application.dtos.UserRequestDto;

public interface IUserService {
    UserResponseDto createUser(UserRequestDto userRequestDto);
    UserResponseDto findById(Long id);
}
