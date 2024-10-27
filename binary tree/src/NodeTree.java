public class NodeTree {

    public char value;
    public NodeTree left=null;
    public NodeTree right=null;




    public boolean isLeaf(){

        return this.left ==null && this.right==null;
    }

    public void print(){      // pre-order root-lift-right    ولو عايز اغير الpre هغير الاماكن عادي
        System.out.println(this.value);
        if(this.left!=null){
            this.left.print();
        }
        if(this.right!=null) {
            this.right.print();
        }
    }

}
