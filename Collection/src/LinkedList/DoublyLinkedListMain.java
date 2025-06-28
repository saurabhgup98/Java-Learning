package LinkedList;
class doublyLinkedList{
    DLNode head;
    DLNode tail;
    int size;

    public void addAtHead(int val){
        DLNode node = new DLNode(val);
        if(head != null) {
            if(head.next == null){
                tail = head;
            }
            node.next = head;
            head.prev = node;
        }else {
            tail = node;
        }
        head = node;
        size++;
    }

    public void display(){
        if(head != null){
            System.out.print("null -> ");
            DLNode node = head;
            System.out.print(head.data + "-> " );
            while (node.next != null){
                node = node.next;
                System.out.print(node.data + " -> ");
            }
        }
        System.out.println("null");
    }

    public void addAtEnd(int val) {
        DLNode node = new DLNode(val);
        if (head == null){
            head = node;

        }else {
            if(tail.prev == null){
                head.next = node;
            }else {
                tail.next = node;
            }
            node.prev = tail;
        }
        tail = node;
        size++;
    }

    public void addAtIndex(int index, int val){
        if (head == null){
            if (index != 0){
                System.out.println("Index should be zero");
            }else {
                addAtHead(val);
            }
        }else {
            if(index == 0){
                addAtHead(val);
            }else if (index > size ){
                System.out.println("Index out of Range and should be less than " + (size + 1));
            }else if(index == size) {
                addAtEnd(val);
            }else {
                DLNode node = new DLNode(val);
                if (index < size / 2){
                    int tempIdx = 0;
                    DLNode temp = head;
                    while (tempIdx < index - 1){
                        temp = temp.next;
                        tempIdx++;
                    }
                    // Traverse from head
                    node.next = temp.next;
                    temp.next = node;
                    node.prev = temp;
                }else {
                    // Traverse from Tail
                    int tempIdx = size;
                    DLNode temp = tail;
                    while (tempIdx > index ){
                        temp = temp.prev;
                        tempIdx--;
                    }
                    node.next = temp.next;
                    temp.next = node;
                    node.prev = temp;
                }
                size++;
            }
        }

    }

    public void  removeFirst(){
        head.next.prev = null;
        head = head.next;
        size--;
    }

    public void removeLast(){

        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void  remove(int index){
        if (index == 0){
            removeFirst();
            return;
        }
        if (index == size - 1){
            removeLast();
        }else {
            int tempIdx;
            DLNode temp;
            if (index < size / 2){
                tempIdx = 0;
                temp = head;
                while (tempIdx < index - 1){
                    temp = temp.next;
                    tempIdx++;
                }
                temp.next = temp.next.next;
                temp.next.next.prev = temp;
            }else {
                tempIdx = size;
                temp = tail;
                while (tempIdx > index){
                    temp = temp.prev;
                    tempIdx--;
                }
                temp.next.next.prev = temp;
                temp.next = temp.next.next;
            }
            size--;
        }


    }

}


public class DoublyLinkedListMain {
    public static void main(String[] args) {
        var dLListOne = new doublyLinkedList();
        dLListOne.addAtIndex(0, 989);
        dLListOne.addAtHead(9);
        dLListOne.addAtHead(11);
        dLListOne.addAtHead(13);
        dLListOne.addAtHead(15);
        dLListOne.addAtEnd(7);
        dLListOne.addAtEnd(8);
        dLListOne.addAtEnd(3);
//        dLListOne.addAtIndex(8,109); // Index at Las test & it works
        dLListOne.addAtIndex(3,88);
        dLListOne.addAtIndex(6, 888);
        dLListOne.remove(0);
        dLListOne.remove(3);
        dLListOne.remove(7);











        System.out.println("Head is:: " + dLListOne.head.data);
        System.out.println("Tail is:: " + dLListOne.tail.data);

        System.out.println("The size of dlListOne is :: " + dLListOne.size);
        dLListOne.display();
    }
}
