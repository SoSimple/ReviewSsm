package com.qjh.test;

import com.qjh.dao.UserDao;
import com.qjh.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserDaoTest {
    @Test
    public void testSave(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) classPathXmlApplicationContext.getBean("userDao");
        userDao.save();
    }
    @Test
    public void testSave2(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        userService.save();
        classPathXmlApplicationContext.close();
    }
    @Test
    public void testBeanScopeSingleton(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) classPathXmlApplicationContext.getBean("userDao");
        UserDao userDao2 = (UserDao) classPathXmlApplicationContext.getBean("userDao");
        //地址相同只有一个对象
        System.out.println(userDao1.toString());
        System.out.println(userDao2.toString());
        //需要手动关闭才可以看到容器执行了销毁方法，其实正常情况下容器时执行了的，只是来不及打印
        classPathXmlApplicationContext.close();
    }

    @Test
    public void testBeanScopePrototype(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) classPathXmlApplicationContext.getBean("userDao");
        UserDao userDao2 = (UserDao) classPathXmlApplicationContext.getBean("userDao");
        //地址不同表示有多个对象
        //当scope='prototype' 时在getBean()的时候创建对象
        //当scope='Singleton' 时在加载配置文件时创建对象
        System.out.println(userDao1.toString());
        System.out.println(userDao2.toString());
    }



    /**
     * 工厂静态方法实例化
     */
    @Test
    public void testStaticBeanFactory(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) classPathXmlApplicationContext.getBean("userDaoFactory");
        UserDao userDao2 = (UserDao) classPathXmlApplicationContext.getBean("userDaoFactory");
        System.out.println(userDao1.toString());
        System.out.println(userDao2.toString());
    }


    @Test
    public void testDynamicBeanFactory(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("D:\\ReviewSsm\\Spring_Ioc\\src\\main\\resources\\applicationContext.xml");
        UserDao userDao1 = (UserDao) classPathXmlApplicationContext.getBean("UserDaoDynamicFactory");
        UserDao userDao2 = (UserDao) classPathXmlApplicationContext.getBean("UserDaoDynamicFactory");
        System.out.println(userDao1.toString());
    }
    @Test
    public void test(){
        int a=10;
        int b=20;
        int c=4;
        System.out.println(++b+c+a++);
    }

}
