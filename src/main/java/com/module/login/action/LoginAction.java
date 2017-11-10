package com.module.login.action;

import com.module.login.service.impl.LoginServiceImpl;
import com.module.user.model.UserDO;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class LoginAction extends ActionSupport {

    private UserDO user;
    @Qualifier("loginService")
    @Autowired
    private LoginServiceImpl loginService;

    public UserDO getUser() {
        return user;
    }

    public void setUser(UserDO user) {
        this.user = user;
    }

    public String userLoginAction() {
        if (user == null) {
            return "error";
        }
        UserDO loginUser = loginService.findByNamePassword(user.getUsername(), user.getPassword());
        if (loginUser == null) {
            return "error";
        }
        return "success";
    }
}
