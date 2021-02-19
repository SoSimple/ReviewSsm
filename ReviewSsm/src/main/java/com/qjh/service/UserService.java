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
    int updateUser(User user);
    int deleteUser(int id);
    int deleteUsers(List<Integer> list);
    int insertUser(User user);
    User checkUser(String userName);
}
