package com.qjh.service.impl;

import com.qjh.dao.UserDao;
import com.qjh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*<bean id="userService" class="com.qjh.service.impl.UserServiceImpl">
</bean>*/
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {
/*
    <property name="userDao" ref="userDao"></property>
*/
    @Autowired //按照是数据类型从Spring容器中进行匹配
        // 也可以使用@Resource 按照名称匹配
        //  或者使用@Autowired+@Qualifier("userDao")  相当于@Resource进行名称匹配
   // @Qualifier("userDao")
    UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
            this.userDao = userDao;
    }
    @Override
    public void save() {
        userDao.save();
        System.out.println("this is service ……");
    }
}
