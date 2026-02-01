import java.util.*;
public class TreeBFSoperations {
     static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node buildBST(int[] arr) {
        Node root = null;
        for (int x : arr) {
            root = insert(root, x);
        }
        return root;
    }

    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.data)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }
     public static void main(String[] args) {
        int[] values = {10, 5, 15, 3, 7, 12, 18, 1, 4,5,23,2,5};
        int[] a={1,2,3,4,5,6};
        int[] b={20,11,2,6,32,1,4,16,19,5};
        Node root = buildBST(values);
        Node Treeroot=buildBST(b);
        bfs(root);
        
    }   
    static void bfs(Node root){
        if(root==null) return;
        Queue<Node> q=new ArrayDeque<>();

        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }
    }
}
