package com.company;

public class Client {
    public static void main(String[] args) {
        whiteDuck Duck = new whiteDuck();
        whiteturkeyDuck turkey = new whiteturkeyDuck();


        Duck duckadapter = new TurkeyAdapter(turkey);
        System.out.println("the duck turkey say ");
        turkey.fly();
        turkey.Globble();
        System.out.println();
//        System.out.println("and  the duck says ");
//        Duck.fly();
//        Duck.quack();
        Duckadapter(Duck);
        Duckadapter(duckadapter);
    }

    static  void Duckadapter(Duck duck){
        duck.fly();
        duck.quack();
    }
}
