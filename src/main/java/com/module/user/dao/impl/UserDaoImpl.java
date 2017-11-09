package com.module.user.dao.impl;

import com.module.user.dao.UserDao;
import com.module.user.model.UserDO;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Qualifier("hibernateTemplateDefault")
    @Autowired
    private HibernateTemplate hibernateTemplateDefault;

    public UserDO get(String uuid) {
        return hibernateTemplateDefault.get(UserDO.class, uuid);
    }

    public void save(UserDO user) {
        hibernateTemplateDefault.save(user);
    }

    public void saveOrUpdate(UserDO user) {
        hibernateTemplateDefault.saveOrUpdate(user);
    }

    public void delete(UserDO user) {
        hibernateTemplateDefault.delete(user);
    }

    public List<UserDO> find(Class<UserDO> clazz, UserDO user) {
        DetachedCriteria criteria = DetachedCriteria.forClass(clazz,"u");
        if (user != null) {
            if (user.getId() != null && user.getId().trim().length() > 0) {
                criteria.add(Restrictions.eq("u.id", user.getId()));
            }
            if (user.getUsername() != null && user.getUsername().trim().length() > 0) {
                criteria.add(Restrictions.eq("u.username", user.getUsername()));
            }
            if (user.getPassword() != null && user.getPassword().trim().length() > 0) {
                criteria.add(Restrictions.eq("u.password", user.getPassword()));
            }
            if (user.getSex() != null) {
                criteria.add(Restrictions.eq("u.sex", user.getSex()));
            }
            if (user.getPhone() != null && user.getPhone().trim().length() > 0) {
                criteria.add(Restrictions.eq("u.phone", user.getPhone()));
            }
            if (user.getEmail() != null && user.getEmail().trim().length() > 0) {
                criteria.add(Restrictions.eq("u.email", user.getEmail()));
            }
            if (user.getUserType() != null) {
                criteria.add(Restrictions.eq("u.userType", user.getUserType()));
            }
        }
        return (List<UserDO>) hibernateTemplateDefault.findByCriteria(criteria);
    }

    public List<UserDO> findAll(Class<UserDO> clazz) {
        DetachedCriteria criteria = DetachedCriteria.forClass(clazz);
        return (List<UserDO>) hibernateTemplateDefault.findByCriteria(criteria);
    }
}
