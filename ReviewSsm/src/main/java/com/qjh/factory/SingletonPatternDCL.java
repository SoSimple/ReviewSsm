package com.qjh.factory;

/**
 * 双重校验锁
 * 线程安全，较复杂，在多线程下能够保持高性能
 */
public class SingletonPatternDCL {
    private SingletonPatternDCL singletonPatternDCL;
    private SingletonPatternDCL(){}

    public SingletonPatternDCL getInstance(){
        if(singletonPatternDCL==null){
            synchronized (SingletonPatternDCL.class){
                if(singletonPatternDCL==null){
                    singletonPatternDCL=new SingletonPatternDCL();
                }
            }
        }
        return singletonPatternDCL;
    }
}
