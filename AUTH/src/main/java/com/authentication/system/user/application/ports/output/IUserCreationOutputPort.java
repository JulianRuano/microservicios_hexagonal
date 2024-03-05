package com.authentication.system.user.application.ports.output;

import com.authentication.system.user.domain.models.User;

public interface IUserCreationOutputPort {
     User create(User user);    
}

