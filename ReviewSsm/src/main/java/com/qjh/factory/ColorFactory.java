package com.qjh.factory;

import com.qjh.dao.*;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color==null){
            return null;
        }
        if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        if(color.equalsIgnoreCase("Green")){
            return new Green();
        }
        if(color.equalsIgnoreCase("Red")){
            return new Red();
        }

        return null;
    }
}
