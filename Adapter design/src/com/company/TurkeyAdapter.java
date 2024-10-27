package com.company;

public class TurkeyAdapter implements Duck {

    turkeyDuck turkeyDuck;

    public TurkeyAdapter(turkeyDuck turkeyDuck){
        this.turkeyDuck =turkeyDuck;

    }

    @Override
    public void fly() {
        for(int i=0;i<5;i++){
            turkeyDuck.fly();
        }


    }

    @Override
    public void quack() {
        turkeyDuck.Globble();

    }
}
