public class LowestCA {
    public static void main(String args[]){
        Tree t1=new Tree();
        t1.growTree(5);
        t1.growTree(4);
        t1.growTree(1);
        t1.growTree(10);
        System.out.println(t1.root.val);
    }

}
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
        left=right=null;
    }
    
}
class Tree{
    Node root=null;
    void growTree(int data){
        root=insert(root,data);}
        Node insert(Node root,int data){
            if(root==null){
                return new Node(data);
            }
            if(data<root.val){
                root.left=insert(root.left,data);
            }
            else{
                root.right=insert(root.right,data);
            }
       return root;
     }

}