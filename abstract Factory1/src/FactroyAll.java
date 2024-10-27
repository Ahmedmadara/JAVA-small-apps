public class FactroyAll {


    public static abstractFactory getFactory(String type){
        if(type.equalsIgnoreCase("Shape"))
            return new abstractFactoryShape();
        else if (type.equalsIgnoreCase("color"))
            return new abstractFactoryColor();
        return null;
    }
}
