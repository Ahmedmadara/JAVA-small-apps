interface Shape {
     void draw();
}



class rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("this is a rectangle draw");

    }
}
class square implements Shape{

    @Override
    public void draw() {
        System.out.println("this is a square draw");

    }
}

class circle implements Shape{
    @Override
    public void draw() {
        System.out.println("this is a circle draw");
    }
}
