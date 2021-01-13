package com.qjh.factorydemo;

import com.qjh.factory.SingletonPattern;

public class SingletonPatternDemo2 {
    public static void main(String[] args) {
        SingletonPattern instance = SingletonPattern.getInstance();
        instance.showSingleton();
    }
}
