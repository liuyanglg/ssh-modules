package com.module.user.dao.impl;

import com.base.BaseTest;
import com.module.user.dao.UserDao;
import com.module.user.model.UserDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserDaoImplTest extends BaseTest {
    @Qualifier("userDao")
    @Autowired
    private UserDao userDao;

    @Test
    public void save() throws Exception {
        UserDO user = new UserDO();
        user.setUsername("liuyang");
        user.setPassword("admin");
        user.setSex(1);
        user.setPhone("15988134708");
        user.setEmail("liuyanglg@outlook.com");
        user.setUserType(1);
        userDao.save(user);
    }

    @Test
    public void saveOrUpdate() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void find() throws Exception {
        UserDO user = new UserDO();
        user.setPassword("admin");
        System.out.println(userDao.find(UserDO.class,user));
    }

    @Test
    public void findAll() throws Exception {
        System.out.println(userDao.findAll(UserDO.class));
    }

    @Test
    public void get() throws Exception {
        userDao.get("1235677");
    }

}