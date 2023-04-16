public class Tree implements Cloneable{

   private Node root = null; 

   public Tree(int data) {
      root = new Node(data);
   }

   public Tree(Tree oldTree) {
      // create a root node and then copy oldTree to the tree whose root is the
      // new root node.
      root = new Node(oldTree.root);
      root.copy(root, oldTree.root);
   }

   @Override
   public Tree clone() throws CloneNotSupportedException{
      Tree tClone = (Tree) super.clone();
      Node rootClone = new Node(root);
      rootClone.copy(rootClone, root);
      tClone.root = rootClone;
      return tClone;
   }

   public void addNode(int data) {
      root.addNode(root, data);
   }

   public Node getRoot( ) {
      return root;
   }

   public void printInOrder( ) {
      Node.printInOrder(root);
   }


}
