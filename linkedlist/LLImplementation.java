//package linkedlist;


public class LLImplementation {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        l1.insert(5);
        l1.insert(10);
        l1.insert(15);
        l1.insert(2);
        l1.insert(4);
        l1.insert(6);
        l1.insert(7);
        l1.insert(8);
        l1.insert(9);
        l1.print();
        l1.head = l1.reverse(l1.head);
        l1.print();
        l1.head=l1.reverse(l1.head);
        System.out.print("Original Linked Lists was: ");
        l1.print();
        System.out.println(l1.mid(l1.head).data);
        LinkedList a=new LinkedList();
        a.insert(9);
        a.insert(9);
        a.insert(9);
        LinkedList b=new LinkedList();
        b.insert(9);
        b.insert(9);
        b.insert(9);
        Node r=a.sum(a.head,b.head);
        LinkedList res=new LinkedList();
        res.head=r;
        res.print();


    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert(int data) {
        Node n1 = new Node(data);

        if (head == null) {
            head = n1;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n1;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    Node reverse(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    Node reverse1(Node head){
        if(head==null)return null;
        Node n=null;
        while(head!=null){
            Node temp=head;
            head=head.next;
            temp.next=n;
            n=temp;
        }
        return n;
    }
    Node mid(Node head){
        if(head==null)return null;
        if(head.next==null)return head;
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    Node sum(Node headA, Node headB){
        if(headA==null)return headB;
        if(headB==null)return headA;
        int c=0;
       // int s=0;
        Node t1=headA;
        Node t2=headB;
        t1=reverse(t1);
        t2=reverse(t2);
        Node result=null;
        //Node temp=null;
        while(t1!=null || t2!=null){
            int s=c;
            if(t1!=null){
                s+=t1.data;
                t1=t1.next;
        }
        if(t2!=null){
            s+=t2.data;
            t2=t2.next;
        }
        
        
            c=s/10;
            s=s%10;
        Node n=new Node(s);
       n.next=result;
       result=n;

    }
    if(c>0){
        Node n=new Node(c);
        n.next=result;
        result=n;
    }
    return result;
}
}

