package com.company;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        }
    }

