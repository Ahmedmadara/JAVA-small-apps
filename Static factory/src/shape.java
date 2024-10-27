interface shape {

    public void draw();
}


class rectangle implements shape {

    @Override
    public void draw() {
        System.out.println("rectangle draw ");
    }
}


    class square implements shape{
        @Override
        public void draw() {
            System.out.println("square draw");
        }
    }

    class circle implements shape{
        @Override
        public void draw() {
            System.out.println("circle draw");
        }
    }

