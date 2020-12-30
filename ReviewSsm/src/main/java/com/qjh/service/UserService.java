package com.qjh.service;

import com.qjh.entity.User;

import java.util.List;

/**
 * @description:
 * @author: 卿建海
 * @date: Created in 2020/12/29 22:41
 * @version:
 * @modified By:
 */

public interface UserService{
    User getUser(int id);
    List<User> getUsers();
    void updateUser();
    void deleteUser();
    void deleteUsers();
    void insertUser(User user);
}
