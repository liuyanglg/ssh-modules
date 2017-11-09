package com.module.user.dao;

import com.module.user.model.UserDO;

import java.util.List;

public interface UserDao {
    UserDO get(String uuid);

    void save(UserDO user);

    void saveOrUpdate(UserDO user);

    void delete(UserDO user);

    List<UserDO> find(Class<UserDO> clazz, UserDO user);

    List<UserDO> findAll(Class<UserDO> clazz);
}
