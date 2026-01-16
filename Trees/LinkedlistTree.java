public class LinkedlistTree {
    

static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}static class Binarytree{
    int idx=-1;
Node build(int[] nodes){
    idx++;
    if(nodes[idx]==-1){
        return null;
        
    }
    Node root=new Node(nodes[idx]);
    root.left=build(nodes);
    root.right=build(nodes);
    return root;
}}
public static void main(String[] args){
    int nodes[]={1,2,4,-1,-1};
    Binarytree tree=new Binarytree();
    Node root=tree.build(nodes);
    System.out.println(root.left.data);
     System.out.println(root.left.data);
    
}
}