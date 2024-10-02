package sharpener.LinkedList;

public class link {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.insertFirst(5);
        ll.insertLast(8);
        ll.insert(10, 1);
        ll.insert(99, 4);
        ll.display();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class linkedlist {
    Node head;
    Node tail;
    int size;

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            insertFirst(data);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
