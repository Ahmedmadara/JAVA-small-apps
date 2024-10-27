public class Node {
    
        public char value;
        public Node left=null;
        public Node right=null;
    public String item;


    public boolean isLeaf(){

            return this.left ==null && this.right==null;
        }

    }
}
