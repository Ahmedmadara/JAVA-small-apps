public class Client {
    public static void main(String[] args) {

        shape shape1 =  Shapefactory.getshape("circle");
        shape shape2 =  Shapefactory.getshape("square");
        shape shape3 =  Shapefactory.getshape("rectangle");
        shape1.draw();
        shape2.draw();
        shape3.draw();
        // الفرق مبينها ومبين الي فاتت انك مش بتحتاج تعرف دي
        //  ShapeFactory shapeFactory = new ShapeFactory();    بتحل علي طول علشان هيا static
    }
}
