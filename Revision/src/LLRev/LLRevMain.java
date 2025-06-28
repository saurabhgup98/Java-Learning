package LLRev;

class LL{

    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    //Method to display the LL
    public void display(){
        if (head != null){
            System.out.print(head.data + " -> ");
            var node = head;
            while (node.next != null){
                node = node.next;
                System.out.print(node.data + " -> ");
            }
        }
        System.out.println("null");
    }

    public int getSize(){
        return size;
    }

    // Method to add element at Head
    public void addAtHead(int data){
        var node = new Node(data);
        if (head == null){
            tail = node;
        }else {
            node.next = head;
        }
        head = node;
        size++;
    }

    public void addAtTail(int data){
        var node = new Node(data);
        if (head == null){
            head = node;

        }else{
            var temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            tail.next = node;
        }
        size++;
        tail = node;
    }

    public void addAtIndex(int idx, int data){
        if(idx < 0 || idx > size) {
            System.out.println("Please enter the index between 0 and " + size);
        } else if (idx == 0){
            addAtHead(data);
        } else if(idx == size){
            addAtTail(data);
        } else {
           int pointer = 1;
           var temp = head.next;
           while (pointer < idx - 1){
               temp = temp.next;
               pointer++;
           }
           var node = new Node(data);
           node.next = temp.next;
           temp.next = node;
        }
        size++;
    }

}

public class LLRevMain {
    public static void main(String[] args) {
       var ll1 = new LL();
       ll1.addAtHead(20);
       ll1.addAtHead(10);
       ll1.addAtHead(5);
       ll1.addAtTail(30);
       ll1.addAtTail(40);
       ll1.addAtIndex(4,67);
       ll1.addAtIndex(3,57);
       System.out.println("Size of ll1 is:: " + ll1.getSize());
       System.out.println(ll1.getHead().data);
       System.out.println(ll1.getTail().data);
       ll1.display();
    }
}
