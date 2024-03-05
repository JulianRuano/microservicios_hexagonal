package com.authentication.system.user.application.ports.input;

import com.authentication.system.user.domain.models.User;

public interface IUserSearchManagerPort {
    User getUserById(Long id);
}
