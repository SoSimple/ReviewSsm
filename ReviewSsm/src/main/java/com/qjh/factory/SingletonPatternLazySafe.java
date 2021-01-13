package com.qjh.factory;

/**
 * 懒汉式——线程安全——加锁
 * 优点：第一次调用才初始化，避免内存浪费
 * 缺点：必须加锁才能保证单例，但加锁会影响效率
 */
public class SingletonPatternLazySafe {

    private static  SingletonPatternLazySafe singletonPattern;
    private SingletonPatternLazySafe(){};

    public  static synchronized SingletonPatternLazySafe getInstance(){
        if (singletonPattern==null){
            singletonPattern=new SingletonPatternLazySafe();
        }
        return singletonPattern;
    }

    public void showSingleton(){
        System.out.println("this is a SingletonPatternLazy");
    }
}
