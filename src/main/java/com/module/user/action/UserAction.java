package com.module.user.action;

import com.module.user.dao.UserDao;
import com.module.user.model.UserDO;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserAction extends ActionSupport {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    private UserDO user;

    public UserDO getUser() {
        return user;
    }

    public void setUser(UserDO user) {
        this.user = user;
    }

    public void queryUserAction() {
        userDao.find(UserDO.class, user);
    }
}
