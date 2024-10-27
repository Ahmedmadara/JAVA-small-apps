package com.company;

public class Client {
    public static void main(String[] args) {
        shape shape = new circleFactory().getshape();
        shape.draw();
        shape shape1 = new rectangleFactory().getshape();
        shape1.draw();
        shape shape2 = new squareFactory().getshape();
        shape2.draw();
    }
}
