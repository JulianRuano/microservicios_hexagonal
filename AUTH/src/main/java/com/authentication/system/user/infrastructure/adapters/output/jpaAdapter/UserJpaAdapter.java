package com.authentication.system.user.infrastructure.adapters.output.jpaAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.authentication.system.user.application.ports.output.IUserCreationOutputPort;
import com.authentication.system.user.application.ports.output.IUserSearchOutputPort;
import com.authentication.system.user.domain.models.User;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.user.UserEntity;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.mapper.IUserPersistenceMappper;
import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.repository.IUserRepository;

import lombok.Data;

@Component
@Data
public class UserJpaAdapter implements IUserCreationOutputPort , IUserSearchOutputPort {

    private final IUserPersistenceMappper userPersistenceMappper;

    @Autowired
    private final IUserRepository userRepository;

    @Override
    public User getById(Long id) {
        UserEntity userEntity = userRepository.findById(id).orElse(null);
        return userPersistenceMappper.toUser(userEntity);   
    }

    @Override
    public User create(User user) {
        UserEntity userEntity = userPersistenceMappper.toUserEntity(user);
        userEntity = userRepository.save(userEntity);
        return userPersistenceMappper.toUser(userEntity);
    }


    
}
