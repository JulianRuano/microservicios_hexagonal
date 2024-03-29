package com.authentication.system.user.infrastructure.adapters.input.rest.mapper;

import org.mapstruct.Mapper;

import com.authentication.system.user.domain.models.User;
import com.authentication.system.user.infrastructure.adapters.input.rest.data.request.user.UserCreateRequest;
import com.authentication.system.user.infrastructure.adapters.input.rest.data.response.user.UserCreateResponse;

@Mapper
public interface IUserCreateMapper {

    User toUser(UserCreateRequest userCreateRequest);
    UserCreateRequest toUserCreateRequest(User user);   
    
    UserCreateResponse toUserCreateResponse(User user);
    User toUser(UserCreateResponse userCreateResponse);  
}
