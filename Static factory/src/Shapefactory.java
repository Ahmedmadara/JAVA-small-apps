public class Shapefactory {

    public static shape getshape(String shapeType) {


        if (shapeType == null) {
            return null;
        }
        else if(shapeType.equalsIgnoreCase("cirlce"))
        return new circle();
        else if(shapeType.equalsIgnoreCase("square"))
            return new square();
        else if(shapeType.equalsIgnoreCase("rectangle"))
            return new rectangle();
        return null;

        }
    }

