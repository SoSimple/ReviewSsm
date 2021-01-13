package com.qjh.factory;

import com.qjh.dao.AbstractFactory;
/**
 * 抽象工厂产生器，通过这个类获取工厂————可以在类的内部对产品族进行约束
 */
public class FactoryProducer {
    /*
        通过getFactory()方法 获取工厂  在我的理解中的抽象工厂，就是在简单工厂模式的基础上，以简单工厂为对象进一步工厂化
     */
    public AbstractFactory getFactory(String factory){
        if(factory==null){
            return null;
        }
        if(factory.equalsIgnoreCase("ColorFactory")){
            return new ColorFactory();
        }
        if(factory.equalsIgnoreCase("ShapeFactory")){
            return new ShapeFactory();
        }
        return null;
    }


}
