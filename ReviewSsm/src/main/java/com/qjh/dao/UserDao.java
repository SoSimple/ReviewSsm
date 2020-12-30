package com.qjh.dao;

import com.qjh.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: 卿建海
 * @date: Created in 2020/12/29 22:40
 * @version:
 * @modified By:
 */

public interface UserDao {
    User getUser(@Param("id") int id);
    List<User> getUsers();
    void updateUser();
    void deleteUser();
    void deleteUsers();
    void insertUser(User user);
}
