package com.user.application.mapper;

import com.user.application.dtos.UserRequestDto;
import com.user.domain.model.User;

public interface IUserRequestMapper {

    User toUser(UserRequestDto userRequestDto);  
}
