package Tree;



public class tree {
   public static void main(String[] args) {
       bsTree bst = new bsTree();
       bst.insert(10);
       bst.insert(9);
       bst.insert(12);
       bst.insert(20);
       bst.insert(4);
       bst.insert(18);
        bst.preOrder(bst.root);
        // System.out.println("Searching for the data...");
        // bst.search(9);
        System.out.println("Deleting a node...");
        bst.delete(12);
        bst.preOrder(bst.root);
   } 

}
 class bsTree{
    Node root;
  
   public void insert(int data){
      root = insertRec(root, data);
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
   public void preOrder(Node root){
    if(root != null){
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
public void delete(int data){
    root = deleteRec( root,data);
}
public Node deleteRec(Node root, int data){
        if(root == null){
          return root;
        }
        if(data<root.data){
          root.left = deleteRec(root.left, data);
        }else if(data>root.data){
          root.right = deleteRec(root.right, data);
        }else{
          if(root.left == null){
              return root.right;
          }else if(root.right == null){
                   return root.left;
          }
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);

       
        }
        return root;
}
public int minValue(Node root){
         int minValue = root.data;
         if(root.left!=null){
               minValue = root.left.data;
               root = root.left;
         }
         return minValue;
}
 public void search(int data){
      Node result = searchRec(root,data);
  if(result != null){
    System.out.println("The data is found: "+data);
  }else{
    System.out.println("The data is not found.");
  }
 }
 public Node searchRec(Node root, int data){
         if(root == null || root.data == data){
          return root;
         }
         if(data<root.data){
          return searchRec(root.left, data);
         }
         return searchRec(root.right, data);
 }
 }
class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
