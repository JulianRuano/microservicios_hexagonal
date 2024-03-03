package com.user.application.services;

import org.springframework.stereotype.Service;

import com.user.application.dtos.UserRequestDto;
import com.user.application.dtos.UserResponseDto;
import com.user.application.mapper.IUserRequestMapper;
import com.user.application.mapper.IUserResponseMapper;
import com.user.application.usecases.IUserService;
import com.user.domain.port.IUserPersistencePort;


@Service
public class UserManagementService implements IUserService {

    private final  IUserRequestMapper userRequestMapper;

    private final IUserResponseMapper userResponseMapper;
    
    private final IUserPersistencePort userPersistencePort;

    public UserManagementService(IUserRequestMapper userRequestMapper, IUserResponseMapper userResponseMapper, IUserPersistencePort userPersistencePort) {
        this.userRequestMapper = userRequestMapper;
        this.userResponseMapper = userResponseMapper;
        this.userPersistencePort = userPersistencePort;
    }


    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        var user = userRequestMapper.toUser(userRequestDto);
        var savedUser = userPersistencePort.save(user);
        return userResponseMapper.toUserRequestDto(savedUser);
    }

    @Override
    public UserResponseDto findById(Long id) {
        var user = userPersistencePort.findById(id);
        return userResponseMapper.toUserRequestDto(user);
    }


}

