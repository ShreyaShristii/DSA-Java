public class Tree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node Buildtree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=Buildtree(nodes);
        newNode.right=Buildtree(nodes);
        return newNode;
        }

    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BinaryTree tree=new BinaryTree();
    Node root=tree.Buildtree(nodes);
    System.out.println(root.data);
    Node ans=LCA(root,4,5);
    System.out.println(ans.data);
    //boolean issame=isSame();
        }
    public static  Node LCA(Node root,int p,int q){
        if (root == null) {
        return null;
    }

        else if(root.data==p || root.data==q){
            return root;

        }
        Node left=LCA(root.left,p,q);
        Node right=LCA(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        else if(right==null){
            return left;
        }
        else{
            return right;
        }
    }
    boolean isSame(Node p,Node q){
        if(p==null || q==null) return false;
        if(p==null && q==null) return true;
        if(p.data!=q.data) return false;
        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }

}
class Btree{
    int[] keys;
    int t;
    BtreeNode[] child;
    int n;
    boolean leaf;
    BtreeNode(int t,boolean leaf){
        this.t=t;
        thi.leaf=leaf;
        keys=new int[2*t-1];
        child=new BtreeNode[2*t];
    }
}
