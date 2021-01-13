package com.qjh.factorydemo;

import com.qjh.dao.AbstractFactory;
import com.qjh.factory.ColorFactory;
import com.qjh.factory.FactoryProducer;
import com.qjh.factory.ShapeFactory;

/**
 *对于抽象工厂可以把多个工厂封装起来，
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        String factorys[] =new String[]{"ColorFactory","ShapeFactory"};
        String colors[] =new String[]{"Blue","Red","Green"};
        String shapes[] =new String[]{"Circle","Square","Rectangle"};

        FactoryProducer factoryProducer = new FactoryProducer();
        for (int i = 0; i <factorys.length ; i++) {
            AbstractFactory factory = factoryProducer.getFactory(factorys[i]);
            System.out.println("-------1----------------");
            if (factory.getClass().equals(ColorFactory.class)){
                System.out.println("-------2----------------");
                for (int j = 0; j < colors.length; j++) {
                    factory.getColor(colors[j]).fill();
                }
            }else if(factory.getClass().equals(ShapeFactory.class)){
                System.out.println("-------3----------------");
                for (int j = 0; j <shapes.length; j++) {
                    factory.getShape(shapes[j]).draw();
                }
            }
        }


    }
}
