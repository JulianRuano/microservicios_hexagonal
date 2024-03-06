package com.authentication.system.user.infrastructure.adapters.input.rest.mapper;

import com.authentication.system.user.domain.models.User;
import com.authentication.system.user.infrastructure.adapters.input.rest.data.response.user.UserGetResponse;

public interface IUserSearchMapper {

    User toUser(UserGetResponse userGetResponse);
    UserGetResponse toUserGetResponse(User user);
    
}
