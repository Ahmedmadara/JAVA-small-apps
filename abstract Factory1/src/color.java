public interface color {

   void fill();
}



class red implements color{
    @Override
    public void fill() {
        System.out.println("REd color");
    }

}

class blue implements color{
    @Override
    public void fill(){
        System.out.println("Blue color");

    }
}
class green implements color{

    @Override
    public void fill() {
        System.out.println("Green color ");
    }
}
