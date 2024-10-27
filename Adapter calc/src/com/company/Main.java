package com.company;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(20,10);

        CalculatorInterface calculatorAdapter = new CalculatorAdapter(triangle);
        System.out.println("the area of triangle is  : "+ calculatorAdapter.getArea(null));
    }

}
