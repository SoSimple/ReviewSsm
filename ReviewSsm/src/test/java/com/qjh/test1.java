package com.qjh;

import com.qjh.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
    private UserDao userDao;

    @Test
    public void testGet(){
        System.out.println(userDao.getUser(1));
    }

}
