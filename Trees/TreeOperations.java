public class TreeOperations {

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
    static int countNodes(Node root){
        if(root==null)return 0;
        return countNodes(root.right)+ countNodes(root.left)+1;
    }
    static int leafNodes(Node root){
        if(root==null)return 0;
        if(root.left==null&& root.right==null){
            return 1;
        }
        else{
        return leafNodes(root.left)+leafNodes(root.right);}
        
    }
    static int height(Node root){
        if(root==null)return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    static int sum(Node root){
        if(root==null) return 0;
        return sum(root.right)+sum(root.left)+root.data;
    }
    static boolean search(Node root,int key){
        if(root==null)return false;
        if(root.data==key) return true;
        if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }
    // static int min(Node root){
    //     if(root.right==null || root.left==null) return root.data;
    //     return Math.min(min(root.right),min(root.left));
    // }
    
    static int min(Node root){
        if(root.left==null) return root.data;
        return min(root.left);
    }
    static int max(Node root){
        if(root.right==null) return root.data;
        return max(root.right);
     }
    static boolean validateBST(Node root,long min,long max){
        if(root==null) return true;
        if(root.data<=min || root.data>=max)return false;
        return validateBST(root.left,min,root.data) && validateBST(root.right,root.data,max);
    }
    static Node LCA(Node root,int p,int q){
        if(root==null)return null;
        if(root.data>p&&root.data>q) return LCA(root.left,p,q);
        if(root.data<p&&root.data<q) return LCA(root.right,p,q);
        return root;
        
    }
    static Node findNode(Node root,int key){
        if(root==null)return null;
        if(root.data==key)return root;
        if(root.data>key)return findNode(root.left,key);
        else{
            return findNode(root.right,key);
        }
    }
    static Node findLeft(Node root){
        //Node dum=new Node(-1);
        if(root==null) return null;
        while(root.left!=null){
            root=root.left;
        }
        //dum=root;
        return root;
    }
    static Node deleteCurrent(Node root){
        if(root.left==null)return root.right;
        if(root.right==null)return root.left;
        Node successor=findLeft(root.right);
        root.data=successor.data;
        root.right=delete(root.right,successor.data);
        return root;
    }
    static Node delete(Node root,int key){
        if(root == null) return null;

    if(key < root.data){
        root.left = delete(root.left, key);
    }
    else if(key > root.data){
        root.right = delete(root.right, key);
    }
    else{
        // node found
        return deleteCurrent(root);
    }

    return root;
    }
    public static void main(String[] args) {
        int[] values = {10, 5, 15, 3, 7, 12, 18, 1, 4,5,23,2,5};
        int[] a={1,2,3,4,5,6};
        Node root = buildBST(values);
        System.out.println("BST created successfully!");
        System.out.println("Total number of nodes in the tree are: "+countNodes(root));
        System.out.println("Number of leaf Nodes in the tree are: "+leafNodes(root));
        System.out.println("The height of the tree is :"+height(root));
        System.out.println("Sum of all nodes in tree is :"+sum(root));
        System.out.println("Search key "+search(root,172));
        System.out.println("Is the given key present? "+search(root,5));
        System.out.println("Minimum value of all the nodes is "+min(root));
        System.out.println("Maximum value of all the nodes is "+max(root));
        System.out.println("Is the given tree a valid BST "+validateBST(root,Long.MIN_VALUE,Long.MAX_VALUE));
        Node result=LCA(root,2,8);
        System.out.println("Lowest Common Ancestor "+result.data);
    }
}
