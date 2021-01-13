package com.qjh.factorydemo;

import com.qjh.dao.Shape;
import com.qjh.factory.FactoryModule;

/**
 * 工厂模式的测试
 * 工厂模式的优点：
 * 1、一个调用者想要创建一个对象，只要知道其名称就可以
 * 2、拓展性高，如果想要增加一个产品，只要拓展一个工厂类就好
 * 3、屏蔽产品的具体实现调用者只需要知道接口就好
 * */
public class FactoryModuleDemo {
    public static void main(String[] args) {
        String shapes [] =new String[]{"Circle","Rectangle","Square"};
        FactoryModule factoryModule = new FactoryModule();
        for (int i = 0; i <shapes.length ; i++) {
            Shape shape = factoryModule.getShape(shapes[i]);
            shape.draw();
        }
    }
}
