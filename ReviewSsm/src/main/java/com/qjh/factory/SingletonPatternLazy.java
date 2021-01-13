package com.qjh.factory;

/**
 * 单例模式——懒汉式 —— 线程不安全——不支持多线程
 */
public class SingletonPatternLazy {

    private static SingletonPatternLazy singletonPattern;
    private SingletonPatternLazy(){};


    public  static SingletonPatternLazy getInstance(){
        if (singletonPattern==null){
            singletonPattern=new SingletonPatternLazy();
        }
        return singletonPattern;
    }

    public void showSingleton(){
        System.out.println("this is a SingletonPatternLazy");
    }
}
