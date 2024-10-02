package Tree;


public class Diameter {
    public static void main(String[] args) {
        bst tree = new bst();
        tree.insert(10);
        tree.insert(5);
        tree.insert(2);
        tree.insert(24);
        tree.insert(12);
        tree.insert(42);
        tree.insert(1);
        System.out.println("Diameter of the tree: "+tree.diameter(tree.root).diameter);
    }
}
class bst{
    Node root;
    public void insert(int data){
        root = insertRec(root,data);
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
    class heightDiameter{
        int height;
        int diameter;
        heightDiameter(int height,int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }
    public heightDiameter diameter(Node root){
        if(root == null){
            return new heightDiameter(0, 0);
        }

        heightDiameter leftheight = diameter(root.left);
        heightDiameter rightheight = diameter(root.right);
        int height = Math.max(leftheight.height,rightheight.height) + 1;
        int rootDiam = leftheight.height + rightheight.height + 1;
        int maxDiam = Math.max(rootDiam, Math.max(leftheight.diameter,rightheight.diameter));
           return new heightDiameter(height, maxDiam);
    }
    // public int Height(Node root){
    //       if(root == null){
    //         return 0;
    //       }
    //       int leftheight = Height(root.left);
    //       int rightheight = Height(root.right);
    //       int myHeight = Math.max(leftheight, rightheight) + 1;
    //       return myHeight;
    // }                         // ! this is inefficient method of finding diameter
    // public int diameter(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    //    int diam1 = diameter(root.left);
    //    int diam2 = diameter(root.right);
    //    int diam3 =   Height(root.left) + Height(root.right) + 1;
    //    return Math.max(diam3,Math.max(diam1,diam2));
    // }
    
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
