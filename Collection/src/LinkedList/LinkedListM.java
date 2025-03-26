package LinkedList;

public class LinkedListM {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListM(){
        this.size = 0;
    }

    public void insert(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(13);
        if(tail == null){
            tail = node;
            head = node;
        }



    }

    public void printElements(){
        if(head == null) {
            System.out.println("Linked List Empty");
            return;
        }
        Node pointer = head;
        while (pointer != null){
            System.out.println(pointer.value);
            pointer = pointer.next;
        }
    }

    private static class  Node{
        private final int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

    }
}
