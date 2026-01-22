package DSA.SinglyLinkedList;

public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // Insert element at the beginning
    void InsertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Insert element at the last
    void InsertAtLast(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            InsertAtFirst(data);
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Inserting the element at given position
    void insertAtPosition(int data, int position) {
        if (position == 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 1) {
            InsertAtFirst(data);
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position Not Found");
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteAtFirst() {
        if (head == null) {
            System.out.println("Empty List");
        }
        head = head.next;
    }

    // Displaying elements
    void Display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("Empty List");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Finding the length of the linked list
    int findLength() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    // Finding the element is present in the linked list or not
    boolean searchingElement(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        // Inserting element inside the linked list
        list.InsertAtFirst(1);
        list.InsertAtFirst(2);
        list.InsertAtFirst(3);
        list.InsertAtFirst(4);

        //Printing the element of linked list
        list.Display();

        // Inserting element in linked list at the last position
        list.InsertAtLast(5);
        list.InsertAtLast(6);
        list.InsertAtFirst(0);

        list.Display();

        list.insertAtPosition(7, 3);
        list.insertAtPosition(8, 5);

        list.Display();

        list.deleteAtFirst();
        list.Display();

        System.out.println("Length of LL is: " + list.findLength());

        System.out.println(list.searchingElement(0));
    }

}
