package com.module.login.service;

import com.module.user.model.UserDO;

public interface LoginService {
    UserDO findByNamePassword(String username, String password);
}
