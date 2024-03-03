package com.user.infrastructure.adapter;

import org.springframework.stereotype.Service;

import com.user.domain.model.User;
import com.user.domain.port.IUserPersistencePort;
import com.user.infrastructure.adapter.mapper.UserDbo;
import com.user.infrastructure.adapter.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserJpaAdapter implements IUserPersistencePort{

    private final UserRepository userRepository;
    private final UserDbo userDbo;

    public UserJpaAdapter(UserRepository userRepository, UserDbo userDbo) {
        this.userRepository = userRepository;
        this.userDbo = userDbo;
    }

    @Override
    public User save(User user) {
        var userEntity = userDbo.toEntity(user);
        if(userEntity == null){
            return null;         
        }
        userEntity = userRepository.save(userEntity);
        return userDbo.toDomain(userEntity);
    }

    @Override
    public User findById(Long id) {
        if (id == null) {
            return null;     
        }
        var userEntity = userRepository.findById(id).orElse(null);
        return userDbo.toDomain(userEntity);  
    }

    
    
}
