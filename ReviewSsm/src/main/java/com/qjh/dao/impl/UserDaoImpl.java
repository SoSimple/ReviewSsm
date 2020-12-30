package com.qjh.dao.impl;

import com.qjh.dao.UserDao;
import com.qjh.entity.User;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: 卿建海
 * @date: Created in 2020/12/30 20:56
 * @version:
 * @modified By:
 */
@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(int id) {
        System.out.println(id);
        User user = userDao.getUser(id);
        System.out.println(user);
        return user;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }

    @Override
    public void deleteUsers() {

    }

    @Override
    public void insertUser(User user) {

    }
}
