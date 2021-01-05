package com.dom.frank.designpattern.factorypattern;

import org.apache.commons.lang3.StringUtils;

public class ShapeFactory {

    public static Shape getShape(String shapeType) {

        if (shapeType.equals("circle")) {
            return new Circle();
        } else if (shapeType.equals("square")) {
            return new Square();
        } else if (shapeType.equals("rectangle")) {
            return new Rectangle();
        }

        return new NoShape();
    }
}
