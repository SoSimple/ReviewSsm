package com.qjh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    /**
     * 测试 Mybatis-PagehHelper
     * @param user
     * @param page
     * @param rows
     * @return
     */
    public List<User> getUsers(User user,Integer page,Integer rows) {
        PageHelper.startPage(page,rows);
        List<User> users = userDao.getUsers();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        System.out.println(userPageInfo.getPageNum()+" "+userPageInfo.getPageSize()+" "+userPageInfo.getPages()
                +""+userPageInfo.getTotal());
        return users;
    }

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

    @Override
    public User checkUser(String userName) {
        return userDao.checkUser(userName);
    }

}


