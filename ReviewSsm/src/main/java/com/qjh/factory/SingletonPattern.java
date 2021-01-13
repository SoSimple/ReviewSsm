package com.qjh.factory;

/**
 * 单例——饿汉式
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 */
public class SingletonPattern {

    private static SingletonPattern singletonPattern=new SingletonPattern();
    private SingletonPattern(){};

    public  static SingletonPattern getInstance(){
        return singletonPattern;
    }

    public void showSingleton(){
        System.out.println("this si a showSingleton");
    }

}
