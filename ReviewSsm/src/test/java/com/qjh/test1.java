package com.qjh;

import com.qjh.dao.UserDao;
import com.qjh.entity.User;
import com.qjh.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @description:
 * @author: 卿建海 看
 * @date: Created in 2020/12/30 22:05
 * @version:
 * @modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class test1 {


    @Autowired
    private UserServiceImpl userService;

    @Test
    public void testGet(){
        System.out.println(userService.getUser(1));
        User user=new User();
        user.setUserName("张三1");
        user.setAge(18);
        user.setPassword("12347688");

        int i = userService.insertUser(user);
        if(i>0){
            List<User> users = userService.getUsers();
            for (User u:users
                 ) {
                System.out.println(u.toString());
            }
        }
    }

}
