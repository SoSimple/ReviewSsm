package com.qjh.factorydemo;

import com.qjh.factory.SingletonPattern;

public class singletonPatternDemo {
    public static void main(String[] args) {
        SingletonPattern instance = SingletonPattern.getInstance();
        instance.showSingleton();
    }
}
