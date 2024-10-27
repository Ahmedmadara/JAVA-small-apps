import java.util.Hashtable;

public class BasicCarCashe {
  private static   Hashtable<String,BasicCar> BasicCarMap = new Hashtable<String, BasicCar>();
  public static BasicCar getcar(String carname) throws Exception {
      BasicCar  cachedbasicCar = BasicCarMap.get(carname);
      return (BasicCar) cachedbasicCar.clone();
  }


  public static void loadCache(){
      BasicCar nano_base = new Nano("green Nano");
      nano_base.price=100000;
      BasicCarMap.put("green Nano",nano_base);
      BasicCar ford_base = new Ford("ford Yellow");
      ford_base.price=150000;
      BasicCarMap.put("ford Yellow",ford_base);



  }
}
