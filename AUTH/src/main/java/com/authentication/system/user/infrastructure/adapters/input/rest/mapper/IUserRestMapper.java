package com.authentication.system.user.infrastructure.adapters.input.rest.mapper;

import com.authentication.system.user.domain.models.User;
import com.authentication.system.user.infrastructure.adapters.input.rest.data.request.user.UserCreateRequest;

public interface IUserRestMapper {

    User toUser(UserCreateRequest userCreateRequest);
    UserCreateRequest toUserCreateRequest(User user);   
}
