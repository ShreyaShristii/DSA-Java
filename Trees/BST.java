public class BST {

    // -------- Node --------
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // -------- Insert --------
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // -------- Inorder --------
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // -------- Preorder --------
    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // -------- Postorder --------
    public static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    //--------Sum of all Nodes--------
    public static int Sum(Node root){
        if(root==null) return 0;
        int l=Sum(root.left);
        int r=Sum(root.right);
        return l+r+root.data;
    }

    // -------- Main --------
    public static void main(String[] args) {

        Node root = null;

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder   : ");
        inorder(root);

        System.out.print("\nPreorder  : ");
        preorder(root);

        System.out.print("\nPostorder : ");
        postorder(root);
        int  n=Sum(root );
        System.out.println("\n  Sum of all Nodes:"+n);
    }
}
