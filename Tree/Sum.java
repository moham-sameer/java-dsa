package Tree;

public class Sum {
    public static void main(String[] args) {
          bst tree = new bst();
          tree.insert(12);
          tree.insert(4);
          tree.insert(8);
          tree.insert(13);
          tree.insert(7);
        System.out.println("The Sum of the tree data: "+tree.Sum(tree.root));          
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
   public int Sum(Node root){
      if(root == null){
          return 0;
      }
    int leftSum = Sum(root.left) ;
    int rightSum = Sum(root.right);
    return leftSum + rightSum + root.data  ;
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
