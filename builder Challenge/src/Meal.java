import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items;

    public Meal(){

        items =new ArrayList<Item>();
    }
    public void addItem(Item item){
        items.add(item);

    }
    public float getprice(){
        float cost = 0.0f;
        for(Item item : items){
            cost+=item.price();
        }
        return cost;
    }
    public void show(){

       for(Item item : items) {
           System.out.print(" Item :" + item.name());
           System.out.print(", packing :" + item.packing().pack());
           System.out.println(" , price : " + item.price());
       }
    }


}
