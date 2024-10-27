public class Client {

    abstractFactory shapeFactory = FactroyAll.getFactory("sharp");
    abstractFactory colorFctory = FactroyAll.getFactory("color");

    Shape shape1 = shapeFactory.getShape("cirlce");
    Shape shape2 = shapeFactory.getShape("square");
    Shape shape3 =shapeFactory.getShape("rectangle");
    color color1 = colorFctory.getcolor("red");
    color color2 = colorFctory.getcolor("green");
    color color3=colorFctory.getcolor("blue");
}
