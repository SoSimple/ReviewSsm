package com.review.test;

import com.review.enetity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {
    @Test
    public void test0(){
        /*
        * 使用ClassPathXmlApplicationContext加载配置文件时需要 将applicationContext.xml
        * 放置再src或者说resources 目录下
        *
        * 该方法是spring容器初始化的核心方法。是spring容器初始化的核心流程，是一个典型的父类模板设计模式的运用
         *	根据不同的上下文对象，会掉到不同的上下文对象子类方法中
         *
         *	核心上下文子类有：
         *	ClassPathXmlApplicationContext
         *	FileSystemXmlApplicationContext
         *	AnnotationConfigApplicationContext
         *	EmbeddedWebApplicationContext(springboot)
        *  1、创建BeanFactory对象
         * 2、xml解析
         * 	传统标签解析：bean、import等
         * 	自定义标签解析 如：<context:component-scan base-package="com.xiangxue.jack"/>
         * 	自定义标签解析流程：
         * 		a、根据当前解析标签的头信息找到对应的namespaceUri
         * 		b、加载spring所以jar中的spring.handlers文件。并建立映射关系
         * 		c、根据namespaceUri从映射关系中找到对应的实现了NamespaceHandler接口的类
         * 		d、调用类的init方法，init方法是注册了各种自定义标签的解析类
         * 		e、根据namespaceUri找到对应的解析类，然后调用paser方法完成标签解析
         *
         * 3、把解析出来的xml标签封装成BeanDefinition对象
        * */
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) classPathXmlApplicationContext.getBean("Person");

        System.out.println(person.toString());
    }

    @Test
    public void test1(){
        /*
        * 使用FileSystemXmlApplicationContext读取配置文件时：
        * 1、可以是applicationContext.xml的绝对路径
        * 2、Spring配置文件存放在项目的根路径下，同样使用FileSystemXmlApplicationContext实现类进行加载。
        * */
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext
                = new FileSystemXmlApplicationContext("D:\\ideaworkspace1\\ReviewSpring\\src\\main\\resources\\applicationContext.xml");

        Person person = (Person) fileSystemXmlApplicationContext.getBean("Person");
        System.out.println(person.toString());
    }
}
