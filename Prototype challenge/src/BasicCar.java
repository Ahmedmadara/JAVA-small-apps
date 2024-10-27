import java.util.Random;

abstract class BasicCar implements Cloneable {

    protected String modelName;
    public int price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public static int setPrice() {
        int price = 0;
        Random rand = new Random();
        int p = rand.nextInt(100000);
        price = p;
        return price;
    }


    @Override
    protected BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}

