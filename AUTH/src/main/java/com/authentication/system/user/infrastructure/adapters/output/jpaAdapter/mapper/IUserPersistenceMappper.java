package com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.mapper;

import com.authentication.system.user.domain.models.User;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.user.UserEntity;

public interface IUserPersistenceMappper {
    UserEntity toUserEntity(User user);
    User toUser(UserEntity userEntity);
}