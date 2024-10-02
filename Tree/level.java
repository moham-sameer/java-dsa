package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class level {
    public static void main(String[] args) {
        bst tree = new bst();
        tree.insert(10);
        tree.insert(5);
        tree.insert(2);
        tree.insert(24);
        tree.insert(12);
        tree.leveOrder(tree.root);
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
    public void leveOrder(Node root){
         if(root == null){
            return;
         }
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         q.add(null);
         while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
         }
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
