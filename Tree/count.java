package Tree;

public class count {
    public static void main(String[] args) {
          bst tree = new bst();
          tree.insert(12);
          tree.insert(4);
          tree.insert(8);
          tree.insert(13);
          tree.insert(7);
        System.out.println("The Count of the tree:"+tree.Count(tree.root));          
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
   public int Count(Node root){
      if(root == null){
          return 0;
      }
    int leftCount = Count(root.left) ;
    int rightCount = Count(root.right);
    return  1 + leftCount + rightCount  ;
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
