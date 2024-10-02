package Tree;

public class binary {
    public static void main(String[] args) {
         TreeNode root = new TreeNode(10);
         TreeNode node1 = new TreeNode(5);
         TreeNode node2 = new TreeNode(20);
            root.left = node1;
            root.right = node2;
        //   preOrder(root);
          inOrder(root);
          postOrder(root);

    }
    public static void preOrder(TreeNode node){
        if(node == null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        inOrder(node.right);
    }
    public static void inOrder(TreeNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);
    }
    public static void postOrder(TreeNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        inOrder(node.right);
        System.out.println(node.value+" ");
    }
}
class TreeNode{
    int value;
    TreeNode right;
    TreeNode left;
    TreeNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}


