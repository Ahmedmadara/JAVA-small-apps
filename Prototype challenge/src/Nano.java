 class Nano extends BasicCar {
    public Nano(String m)
    {
        modelName=m;

    }
  @Override
     public Nano clone() throws CloneNotSupportedException {

        Nano clone =null;
        clone =(Nano) super.clone();
        return clone;
  }
}
