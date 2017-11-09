package com.module.user.service.impl;

import com.module.user.dao.UserDao;
import com.module.user.model.UserDO;
import com.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Qualifier("userDao")
    @Autowired
    private UserDao userDao;

    public UserDO get(String uuid) {
        return userDao.get(uuid);
    }

    public void save(UserDO user) {
        userDao.save(user);
    }

    public void saveOrUpdate(UserDO user) {
        userDao.saveOrUpdate(user);
    }

    public void delete(UserDO user) {
        userDao.delete(user);
    }

    public List<UserDO> find(Class<UserDO> clazz, UserDO user) {
        return userDao.find(clazz, user);
    }

    public List<UserDO> findAll(Class<UserDO> clazz) {
        return userDao.findAll(clazz);
    }
}
