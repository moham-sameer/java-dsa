package Tree;

public class bst {
    public static void main(String[] args) {
       bstTree tree = new bstTree();
       tree.insert(10);
       tree.insert(5);
       tree.insert(16);
       tree.insert(24);
       tree.insert(30);
       tree.insert(4);
       tree.inOrder(tree.root);
      //  System.out.println("Searching for number 4");
      //  tree.search(4);
      //  System.out.println("Searching for number 8");
      //  tree.search(8);
       System.out.println("Deleting 4:");
       tree.delete(4);
       System.out.println("Traversal after deletion of the node:");
       tree.inOrder(tree.root);

    }
}
class bstTree{
    Node root;
    public void insert(int value){
       root = insertRec(root, value);
    }
    private Node insertRec(Node root, int value){
           if(root == null){
            root = new Node(value);
            return root;
           }
           if(value> root.value){
             root.right = insertRec(root.right, value);
           }else if(value < root.value){
             root.left = insertRec(root.left, value);
           }
           return root;
    }
    public void delete(int value){
       root = deleteRec(root,value);
    }
    public Node deleteRec(Node root,int value){
          if(root == null){
            return root;
          }
          if(value<root.value){
            root.left = deleteRec(root.left, value);
          }else if(value>root.value){
            root.right = deleteRec(root.right, value);
          }else{
            if(root.left == null){
              return root.right;
            }else if(root.right == null){
              return root.left;
            }
            root.value = minValue(root.right);
            root.right = deleteRec(root.right, root.value);
          }

          return root;
    }
    private int minValue(Node root){
           int minValue = root.value;
           while(root.left != null){
              minValue = root.left.value;
              root = root.left;
           }
           return minValue;
    }
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.value+" ");
            inOrder(root.right);
        }
    }
    public void search(int value){
        Node result = searchRec(root, value);
        if(result != null){
            System.out.println("The value is found: "+value);
        }else{
            System.out.println("The value is not found.");
        }
    }
    public Node searchRec(Node root, int value){
          if(root == null || root.value == value){
            return root;
          }
          if(value<root.value){
            return searchRec(root.left, value);
          }
            return searchRec(root.right, value);
          
    }
}

class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
        left = right = null;
    }
}
