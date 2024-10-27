package com.company;

interface turkeyDuck {
    public void Globble();
    public void fly();

}

class whiteturkeyDuck implements turkeyDuck{


    @Override
    public void Globble() {
        System.out.println("Globble Globble");
    }

    @Override
    public void fly() {
        System.out.println("I am Flaying a short Distance");

    }
}
