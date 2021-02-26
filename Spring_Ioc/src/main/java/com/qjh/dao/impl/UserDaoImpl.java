package com.qjh.dao.impl;

import com.qjh.dao.UserDao;
import com.qjh.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Properties;

//@Component("userDao")
/*
<bean id="userDao" class="com.qjh.dao.impl.UserDaoImpl"></bean>
*/
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    private String username;
    private int age;
    private List<String> strList;
    private Map<String, User> map;
    private Properties properties;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void save() {
        System.out.println("user save is running ……");
        System.out.println(username+"---------"+age);
        System.out.println(strList+"-------"+map);
        System.out.println(properties);
    }

    public UserDaoImpl() {
        System.out.println("userDao is Created!!");
    }

    public void init(){
        System.out.println("初始化方法……");
    }

    public void destory(){
        System.out.println("销毁方法……");
    }

}
