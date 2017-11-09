package com.module.login.service.impl;

import com.module.user.dao.impl.UserDaoImpl;
import com.module.user.model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("loginService")
public class LoginServiceImpl {

    @Qualifier("userDao")
    @Autowired
    private UserDaoImpl userDao;

    public UserDO findByNamePassword(String username, String password) {
        if (username == null | username.trim().length() <= 0) {
            return null;
        }
        if (password == null | password.trim().length() <= 0) {
            return null;
        }

        UserDO user = new UserDO();
        user.setUsername(username);
        user.setPassword(password);
        List<UserDO> list = userDao.find(UserDO.class, user);
        if (list == null || list.size() != 1) {
            return null;
        }

        return list.get(0);
    }
}
