package com.company;

public abstract class AbstractShapeFactory {

    protected abstract shape factorymethod();

    public shape getshape() {

        return factorymethod();
    }
}

class rectangleFactory extends AbstractShapeFactory {

    protected shape factorymethod() {
        return new rectangle();
    }
}

class circleFactory extends AbstractShapeFactory {

    protected shape factorymethod() {
        return new circle();
    }
}

class squareFactory extends AbstractShapeFactory {

    protected shape factorymethod() {
        return new square();
    }
}
