public abstract class abstractFactory {

    abstract color getcolor(String color);

    abstract Shape getShape(String shape);
}


class abstractFactoryShape extends abstractFactory {

    public Shape getShape(String shape) {

        if (shape == null)
            return null;

        if (shape.equalsIgnoreCase("cirlce"))
            return new circle();
        else if (shape.equalsIgnoreCase("square"))
            return new square();
        else if (shape.equalsIgnoreCase("rectangle"))
            return new rectangle();
        return null;

    }

    color getcolor(String color) {
        return null;

    }
}

class abstractFactoryColor extends abstractFactory {


    color getcolor(String color) {
        if (color == null)
            return null;
        if (color.equalsIgnoreCase("Red"))
            return new red();
        else if (color.equalsIgnoreCase("Blue"))
            return new blue();
        else if (color.equalsIgnoreCase("green"))
            return new green();
        return null;


    }

    Shape getShape(String shape) {

        return null;
    }
}
