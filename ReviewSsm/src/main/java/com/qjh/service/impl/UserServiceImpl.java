package com.qjh.service.impl;

import com.qjh.dao.UserDao;
import com.qjh.entity.User;
import com.qjh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: 卿建海
 * @date: Created in 2020/12/29 22:41
 * @version:
 * @modified By:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Override
    public List<User> getUsers() {
        List<User> users = userDao.getUsers();
        return users;
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userDao.deleteUser(id);
    }

    @Override
    public int deleteUsers(List<Integer> list) {
        return 0;
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

}


