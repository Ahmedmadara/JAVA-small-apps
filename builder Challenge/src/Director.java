 class Director {
    MealBuilderIntrface MyBuilder;


    public void costract(MealBuilderIntrface myBuilder){

        MyBuilder=myBuilder;
         MyBuilder.buildBurge();
         MyBuilder.buildDrink();
         MyBuilder.getmeal();
    }
}
