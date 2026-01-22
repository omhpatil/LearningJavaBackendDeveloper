package DSA.LinkedList;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        list.head.next = second;
        second.next = third;
        third.next = null;  // end of list

        list.print();
    }
}
