public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node (int _data) {
        data = _data;
        left = null;
        right = null;
    }

    public Node (Node copy){
        this.data = copy.data;
        this.left = null;
        this.right = null;
    }

    static void copy(Node toRoot, Node fromRoot){
        if (fromRoot == null){
            return;
        }

        if (fromRoot.left != null) {
            toRoot.left = new Node(fromRoot.left);
            copy(toRoot.left, fromRoot.left);
        }
        if (fromRoot.right != null){
            toRoot.right = new Node(fromRoot.right);
            copy(toRoot.right, fromRoot.right);
        }

    }

    static void addNode(Node node, int d){

        Node current = node;
        Node parent = null;

        if (node == null) {
            new Node(d);
            return;
        }

        while (current != null){
            parent = current;

            if (d < current.data){
                current = current.left;
            }
            else{
                current = current.right;
            }
        }

        if (d < parent.data){
            parent.left = new Node(d);
        }
        if (d > parent.data){
            parent.right = new Node(d);
        }

        return;
    }

    static void printInOrder(Node node){
        if (node == null){
            return;
        }
        printInOrder(node.left);
        System.out.print(""+node.data+" ");
        printInOrder(node.right);
    }

    public int getData(){
        return data;
    }

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }
}
