package LinkedList;

// Let's implement our own Linked List
class linkedList{
   Node head;
   Node tail;
   int size;

   //Let's create the Functions
    public void addAtEnd(int val){
        // Create a new Node
        Node node = new Node(val);
        //Now update the tail.next to current node
        // But what if the Linked List is empty so we need to check if head or tail == null
        if(head == null){
            head = node;
        }else {
            tail.next = node;
        }
        // By default new node next == null
        // Now update the tail
        size++;
        tail = node;
    }

    public void  display(){
        if (head == null){
            System.out.println();
        }else {
            Node currentNode = head;
            while (currentNode != null){
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
        }
        System.out.println("null");
    }

    public int getSize(){return size;}

    public void addAtIndex(int index, int val){
        Node node = new Node(val); // 10, 20,30', 40 index 2 70 next = 30
        if(head == null){
            head = node;
            tail = node;
        }else {
            if(index == 0){
                node.next = head;
                head = node;
            }else {
                int prevNodeIndex = 1;
                Node currentNode = head;
                while (prevNodeIndex < index){
                    currentNode = currentNode.next;
                    prevNodeIndex++;
                }
                node.next = currentNode.next;
                if(currentNode.next == null){
                    tail = node;
                }
                currentNode.next = node;
            }
        }
        size++;
    }

//    public void addAtStart(int val){
//        // Create new Node with val
//        Node node = new Node(val);
//
//        // check if the Head is null or not
//        // if yes then make new node as head and tail
//        if(head == null){
//            head = node;
//            tail = node;
//        }else {
//            // if no then
//            //1. node.next = head
//            node.next = head;
//
//            //2. head = node
//            head = node;
//        }
//        size++;
//    }

    public void addAtStart(int val){
        addAtIndex(0, val);
    }

    public int getElement(int index){
        if (index < 0 || index > size){
            return 0;
        }
        int i = 0;
        Node currentNode = head;
        while (i != index){
            currentNode = currentNode.next;
            i++;
        }
        return currentNode.data;
    }

    public void delete(int index){
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        Node currentNode = head;
        int temp = 1;
        while (temp < index ){
            currentNode = currentNode.next;
            temp++;
        }
        if(currentNode.next.next != null){
            currentNode.next = currentNode.next.next;
        }else {
            currentNode.next = null;
            tail = currentNode;
        }
        size--;
    }
}

public class LinkedListMain {
    public static void main(String[] args) {
        linkedList lList1 = new linkedList();
        lList1.addAtEnd(20);
        lList1.addAtEnd(30);
        lList1.addAtEnd(40);
        lList1.addAtStart(12);
        lList1.addAtIndex(4, 70);
        lList1.delete(0);
        lList1.display();
        System.out.println("The Size of the Linked List is:: " + lList1.getSize());
        System.out.println(lList1.getElement(6));
        System.out.println("tail is:: " + lList1.head.data);
    }
}
