package com.user.infrastructure.adapter.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.user.domain.model.User;
import com.user.infrastructure.adapter.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserDbo {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    UserEntity toEntity(User user);

    @InheritInverseConfiguration
    User toDomain(UserEntity userEntity);
}
