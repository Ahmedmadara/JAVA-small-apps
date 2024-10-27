package com.company;

public interface CalculatorInterface {
// targetInterFace
    double getArea(Rectangle r);
}
class Calculator implements CalculatorInterface{
    Rectangle rectangle;

    @Override
    public double getArea(Rectangle r) {
        return  rectangle.length*rectangle.width;
    }
}
