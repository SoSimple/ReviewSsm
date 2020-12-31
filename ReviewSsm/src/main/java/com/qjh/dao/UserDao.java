package com.qjh.dao;

import com.qjh.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: 卿建海
 * @date: Created in 2020/12/29 22:40
 * @version:
 * @modified By:
 */
@Repository
public interface UserDao {
    User getUser(@Param("id") int id);
    List<User> getUsers();
    int updateUser(User user);
    int deleteUser(int id);
    int deleteUsers(List<Integer> list);
    int insertUser(User user);
}
