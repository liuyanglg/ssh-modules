package com.module.user.service;

import com.base.BaseTest;
import com.module.user.model.UserDO;
import com.module.user.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserServiceImplTest extends BaseTest {
    @Qualifier("userService")
    @Autowired
    private UserServiceImpl userService;

    @Test
    public void save() throws Exception {
        UserDO user = new UserDO();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setSex(1);
        user.setPhone("15988134708");
        user.setEmail("liuyangrxy@163.com");
        user.setUserType(99);
        userService.save(user);
    }

    @Test
    public void find() throws Exception {
    }

}