package com.authentication.system.user.domain.service;

import org.springframework.stereotype.Service;

import com.authentication.system.user.application.ports.input.IUserCreationManagerPort;
import com.authentication.system.user.application.ports.output.IUserCreationOutputPort;
import com.authentication.system.user.domain.models.User;

@Service
public class UserCreationService implements IUserCreationManagerPort {

    private final IUserCreationOutputPort userCreationPort; 

    public UserCreationService(IUserCreationOutputPort userCreationPort) {
        this.userCreationPort = userCreationPort;
    }

    @Override
    public User createUser(User user) {
        return userCreationPort.create(user);  
    }
    
}
