package LinkedListLevel;

public class LinkedList{
    private class Node{
        private int data;
        private Node next;

        public Node(int value){
            this.data = value;
            this.next = null;
        }

        public Node(int value, Node nxtNode){
            this.data = value;
            this.next = nxtNode;
        }
    }

    private Node head;
    private int size;

    //Display

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
    }

    //Insertion 

    public void insertFront(int value){
        Node newNode = new Node(value);
        size++;
        if (head == null){
            this.head = newNode;
        } else {
            newNode.next = head;
            this.head = newNode;
        }
    }

    //Insertion To Index

    public void insert(int value, int index){
        Node newNode = new Node(value);
        int count = 1;
        if (index == 0){
            insertFront(value);
        } else {
            Node current = head;
            while(current.next != null || count != index){
                count++;
                current = current.next;
            }
            if (current.next == null && count == index){
                current.next = newNode;
            } else if (count == index){
                newNode.next = current.next;
                current.next = newNode;
            } else {
                System.out.println("index out of range");
            }

        }
    }
}
