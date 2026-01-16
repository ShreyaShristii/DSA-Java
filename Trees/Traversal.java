// public class Traversal{
//     public static void main(String args[]){
// int[] nodes = {1, 2, 3, -1, -1, 3, -1, -1, 564, -1, 78, -1, -1};

// Binarytree.Btree tree=new Binarytree.Btree();
// Binarytree.Node root=tree.buildTree(nodes);
//     }
// }
//  class Binarytree{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;

//         }
//     }
//     static class Btree{
//         static int idx=-1;
//         public static Node buildTree(int nodes[]){
//             idx++;
//             // if(nodes[idx]==-1){
//             //     return null;
//             // }
//             if (idx >= nodes.length || nodes[idx] == -1) {
//             return null;
//         }

//             Node newNode=new Node(nodes[idx]);
//             newNode.left=buildTree(nodes);
//             newNode.right=buildTree(nodes);
//             return newNode;
//         }
//     }
// }
import java.util.*;
public class Traversal {
    public static void main(String args[]) {
System.out.println("Hello");
        int[] nodes = {1, 2, 3, -1, -1, 3, -1, -1, 564, -1, 78, -1, -1};

        Binarytree.Btree tree = new Binarytree.Btree();
        Binarytree.Node root = tree.buildTree(nodes);

        preorder(root);
    }

    static void preorder(Binarytree.Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

class Binarytree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Btree {
        static int idx = -1;

        static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
}
public static void levelot(Node root){
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
        Node curr=q.remove();
    }
}
//hii
