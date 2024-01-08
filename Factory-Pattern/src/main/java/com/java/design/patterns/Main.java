package com.java.design.patterns;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        if (Objects.nonNull(shape)) shape.draw();
        else System.out.println("NOTHING for circle");
        shape = shapeFactory.getShape("square");
        if (Objects.nonNull(shape)) shape.draw();
        else System.out.println("NOTHING for square");
    }
}