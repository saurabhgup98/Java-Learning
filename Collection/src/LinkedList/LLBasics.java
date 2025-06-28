package LinkedList;


public class LLBasics {
    public static void display(Node head){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void displayRecursively(Node head){
        if (head == null){
            return;
        }
        System.out.print(head.data + " ");
        head = head.next;
        displayRecursively(head);
    }

    public static int size(Node head){
        int size = 0;
        while (head != null){
            size++;
            head = head.next;
        }
        return size;
    }

    public static void main(String[] args) {
        /*Node n1 = new Node(5);
        System.out.println(n1); // O/ P => LinkedList.Implementation.Node@3feba845
        Node n2 = new Node(12);
        System.out.println(n2); // O/ p => LinkedList.Implementation.Node@3feba861

        //pointer1:: =>
        // Now we can say that If we store next Node address, Then we can say
        // we achieved req structure where each node has value and address of next Node

        // So Let's add One more Variable "Node" which wil store address of Next Node
        // After Adding Let's add the Address of Next Node inside the next of Prev Node
        n1.next = n2;
        System.out.println(n1.next); // O/ p => LinkedList.Implementation.Node@3feba861
        Node n3 = new Node(20);
        n2.next = n3;
        System.out.println(n2.next);
        Node n4 = new Node(23);
        n3.next = n4;
        System.out.println(n3.next);
        System.out.println(n4.next); // O/ P => null as it is last Node or Tail

        // let's Now access the "n2" Data using the "n1.next"
        System.out.println(n1.next.data);
        // We can also access the next Node of n2 using n1.next
        System.out.println("The address of n3(next Node pf n2) using n1.next ::" + n1.next.next); //LinkedList.Implementation.Node@5b480cf9

        // Display Linked List
        //Option 1: General Display
        System.out.println("Data of n1 is:: " + n1.data);
        System.out.println("Data of n2 is:: " + n2.data);
        System.out.println("Data of n3 is:: " + n3.data);
        System.out.println("Data of n4 is:: " + n4.data);

        System.out.println("Display Linked List General Way ");
        System.out.println("Display Linked List using the Head Node");
        // Option 1:Just using the Head Node
        System.out.println("Data of n1 is:: " + n1.data);
        System.out.println("Data of n2 is:: " + n1.next.data);
        System.out.println("Data of n3 is:: " + n1.next.next.data);
        System.out.println("Data of n4 is:: " + n1.next.next.next.data);

        // But from above we can see that If I run the loop
        display(n1);
        displayRecursively(n1);
        System.out.println("The size is :: " + size(n1));
*/
        //CREATE THE DLNODE CLASS AND CREATE DOUBLE LINKED LIST IN MAIN METHOD
        var dLList1 = new DLNode(122);
        var dLList2 = new DLNode(123);
        var dlList3 = new DLNode(124);
        var dlList4 = new DLNode(125);
        dLList1.next = dLList2;
        dLList2.prev = dLList1;
        dLList2.next = dlList3;
        dlList3.prev = dLList2;
        dlList3.next = dlList4;
        dlList4.prev = dlList3;
        System.out.println("The current value of dlList1 is:: " + dLList1.data + " and next is :: " + dLList1.next.data);
        System.out.println("The current value of dlList 2 is :: " + dLList2.data + " and next is :: " + dLList2.next.data +
                " and prev is :: " + dLList2.prev.data);
        System.out.println("The current value of dlList 3 is :: " + dlList3.data + " and next is:: " + dlList3.next.data
                + " and prev is :: " + dlList3.prev.data);
        System.out.println("The current value of dlList 4 is :: " + dlList4.data + " and prev is" + dlList4.prev.data);




    }
}
