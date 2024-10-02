package Tree;

public class height {
    public static void main(String[] args) {
          bst tree = new bst();
          tree.insert(12);
          tree.insert(4);
          tree.insert(8);
          tree.insert(13);
          tree.insert(7);
        System.out.println("The height of the tree:"+tree.Height(tree.root));          
    }
}
class bst{
    Node root;
   public void insert(int data){
      root = insertRec( root,data);
   }
   public Node insertRec(Node root, int data){
         if(root == null){
            root = new Node(data);
         }
         if(data<root.data){
            root.left = insertRec(root.left, data);
         }else if(data>root.data){
            root.right = insertRec(root.right, data);
         }
         return root;
   }
   public int Height(Node root){
      if(root == null){
          return 0;
      }
    int leftHeight = Height(root.left) ;
    int rightHeight = Height(root.right);
    return  1 +  Math.max(leftHeight,rightHeight);
   }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
