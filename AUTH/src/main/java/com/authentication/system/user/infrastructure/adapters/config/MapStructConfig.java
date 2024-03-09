package com.authentication.system.user.infrastructure.adapters.config;

import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.authentication.system.user.infrastructure.adapters.input.rest.mapper.IUserCreateMapper;
import com.authentication.system.user.infrastructure.adapters.input.rest.mapper.IUserSearchMapper;

@Configuration
public class MapStructConfig {

    @Bean
    IUserCreateMapper userCreateMapper() {
        return Mappers.getMapper(IUserCreateMapper.class);
    }   

    @Bean
    IUserSearchMapper userSearchMapper() {
        return Mappers.getMapper(IUserSearchMapper.class);
    }  
}
