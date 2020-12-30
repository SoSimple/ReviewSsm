package com.qjh;

import com.qjh.dao.UserDao;
import com.qjh.dao.impl.UserDaoImpl;
import com.qjh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: 卿建海
 * @date: Created in 2020/12/30 22:05
 * @version:
 * @modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class test1 {
    @Test
    public void testGet(){
        UserDaoImpl userDao=new UserDaoImpl();
        User user = userDao.getUser(1);
        System.out.println(user.toString());
    }

}
