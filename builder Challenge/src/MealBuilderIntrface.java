public interface MealBuilderIntrface {

    void buildBurge();
    void buildDrink();
    Meal getmeal();
}
class VegMealbuilde implements  MealBuilderIntrface{

    private Meal VegMeal = new Meal();
    @Override
    public void buildBurge() {
  VegMeal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        VegMeal.addItem(new coke());

    }

    @Override
    public Meal getmeal() {
        return VegMeal;
    }
}


class nonVegMealBuilder implements MealBuilderIntrface{
 private Meal noneVegMeal =new Meal();
    @Override
    public void buildBurge() {
noneVegMeal.addItem(new checkenBurger());
    }

    @Override
    public void buildDrink() {
        noneVegMeal.addItem(new pepsi());

    }
    @Override
    public Meal getmeal() {
        return noneVegMeal;
    }
}
