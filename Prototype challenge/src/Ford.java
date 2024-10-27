 class Ford extends BasicCar  implements  Cloneable{
    public Ford(String m)
    {
        setModelName(m);

    }
    @Override
    public Ford clone() throws CloneNotSupportedException {

        Ford clone = null;
        clone= (Ford) super.clone();
        return clone;
    }
}
