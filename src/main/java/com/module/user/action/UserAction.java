package com.module.user.action;

import com.module.user.model.UserDO;
import com.module.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserAction extends ActionSupport {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    private UserDO user;

    public UserDO getUser() {
        return user;
    }

    public void setUser(UserDO user) {
        this.user = user;
    }

    public void queryUserAction() {
        userService.find(UserDO.class, user);
    }
}
