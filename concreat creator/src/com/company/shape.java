package com.company;
interface shape {

    public void draw();
}

class rectangle implements shape {

    @Override
    public void draw() {
        System.out.println("this is rectangle draw");
    }
}

class square implements shape{

    @Override
    public void draw(){

        System.out.println("this is a square draw");
    }
}
class circle implements shape{

    @Override
    public void draw() {
        System.out.println("this is a circle draw");
    }
}
