package com.authentication.system.user.application.ports.input;
import com.authentication.system.user.domain.models.User;

public interface IUserCreationManagerPort {
    User createUser(User user);    
}
