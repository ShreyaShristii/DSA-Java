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
        l1.print();
        l1.head = l1.reverse(l1.head);
        l1.print();
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
}

