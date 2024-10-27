public class Tree {
    public static void main(String[] args) {

        preOrder(p.left);
        preOrder(p.right);


    }
    static void preOrder(Node p){


        if(p!=null){

            System.out.println(p.item+" ");

        }

    }
}
