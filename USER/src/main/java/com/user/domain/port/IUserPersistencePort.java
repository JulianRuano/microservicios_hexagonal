package com.user.domain.port;

import com.user.domain.model.User;

public interface IUserPersistencePort {

    User save(User user);
    User findById(Long id);
    
}
