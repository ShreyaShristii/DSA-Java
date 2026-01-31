import java.util.*;
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
    // static Node LCA(Node root,int p,int q){
    //     if(root==null)return null;
    //     if(root.data>p&&root.data>q) return LCA(root.left,p,q);
    //     if(root.data<p&&root.data<q) return LCA(root.right,p,q);
    //     return root;
        
    // }
    static Node LCA(Node root,int p,int q){
        if(root==null) return null;
        if(root.data>p && root.data>q) return LCA(root.left,p,q);
        if(root.data<p && root.data<q) return LCA(root.right,p,q);
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
    static void leftView(Node root,int level,ArrayList<Integer> l){
        if(root==null)return;
        
        if(l.size()==level){
            l.add(root.data);
        }
        leftView(root.left,level+1,l);
        leftView(root.right,level+1,l);
        
    }
    static void allPath(Node root,String s){
        if(root==null)return ;
        s+=root.data;
        s+=" ";
        if(root.left==null && root.right==null)System.out.println(s+" ");
        allPath(root.right,s);
        allPath(root.left,s);

    }
     static void pathToKey(Node root,String s,int key){
        if(root==null)return ;
        s+=root.data;
        s+=" ";
        if(root.data==key)System.out.println(s+ " ");
        pathToKey(root.right,s,key);
        pathToKey(root.left,s,key);

    }
    static void nodeLevel(Node root,int l,int key){
        if(root==null)return ;
        if(root.data==key)System.out.println(l);
        nodeLevel(root.right,l+1,key);
        nodeLevel(root.left,l+1,key);
        
    }
    static void BFS(Node root){
        if(root==null)return;
        Queue<Node> q=new java.util.LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }
    }
    public static void main(String[] args) {
        int[] values = {10, 5, 15, 3, 7, 12, 18, 1, 4,5,23,2,5};
        int[] a={1,2,3,4,5,6};
        int[] b={20,11,2,6,32,1,4,16,19,5};
        Node root = buildBST(values);
        Node Treeroot=buildBST(b);
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
        System.out.println("LeftView");
        ArrayList<Integer> l=new ArrayList<>();
        leftView(root,0,l);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i)+" ");
        }
        System.out.println("All the paths from root to leaf: ");
        allPath(Treeroot,"");
        System.out.println("Path till the given key is ");
        pathToKey(Treeroot,"",4);
        System.out.println("Level of the given key is ");
        nodeLevel(root,0,23);
        System.out.println("Breadth First Search");
        BFS(root);

    }
}
