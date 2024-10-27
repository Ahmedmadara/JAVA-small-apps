public class Client {
    public static void main(String[] args) throws Exception {

        BasicCarCashe.loadCache();

        BasicCar basicCar = (BasicCar)BasicCarCashe.getcar("green Nano");
        basicCar.price=basicCar.price+BasicCar.setPrice();
        System.out.println("the car name is : " + basicCar.modelName  + " and its price is : " + basicCar.price);

        BasicCar basicCar2 = (BasicCar)BasicCarCashe.getcar(" ford Yellow ");
        basicCar2.price=basicCar2.price+BasicCar.setPrice();
        System.out.println(" the car name is : " + basicCar2.modelName + " and its price is : " + basicCar2.price);
    }
}
