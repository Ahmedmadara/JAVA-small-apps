
interface Item {
    public String name();
    public packing packing();
    public float price();
}
interface packing{
    public String pack();
}



abstract class Burger implements Item{

    @Override
    public packing packing() {
        return Wrapper;
    }
    @Override
    public abstract float price();
    }

    class VegBurger extends Burger{

        public float price(){
            return 3.50f;

    }
    @Override
        public String name(){

            return "Veg Burger";
    }

}
class checkenBurger extends Burger{

    @Override
    public String name(){
        return "CheckenBurger";
    }
    @Override
    public float price(){
        return 5.0f;
    }
}

abstract class ColdDrink implements Item{
    @Override
    public packing packing() {
        return Bottle;
    }
    @Override
    public abstract float price();

}

class pepsi extends ColdDrink{


    public float price(){
       return  1.5f;
    }
    public String name(){
        return "Pepsi";
    }
}
class coke extends ColdDrink{
    public float price(){
        return  1.75f;
    }
    public String name(){
        return "Coke";
    }
}

class Wrapper implements packing{
    @Override
    public String pack(){
        return "Wrapper";
    }
}
class Bottle implements packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}


