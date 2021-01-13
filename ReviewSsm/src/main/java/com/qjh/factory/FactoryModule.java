package com.qjh.factory;

import com.qjh.dao.Circle;
import com.qjh.dao.Rectangle;
import com.qjh.dao.Shape;
import com.qjh.dao.Square;

/*
* 工厂模式
* */
public class FactoryModule {

    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
