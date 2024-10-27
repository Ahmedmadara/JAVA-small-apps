package com.company;

interface Duck {
    public void fly();
    public void quack();

}


class whiteDuck implements Duck{

    @Override
    public void fly() {
        System.out.println("I am Flaying");

    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
