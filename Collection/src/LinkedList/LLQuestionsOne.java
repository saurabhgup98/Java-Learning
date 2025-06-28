package LinkedList;

import org.w3c.dom.NodeList;

import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public void addNode(ListNode node){
        NodeList head = null;

    }
}

public class LLQuestionsOne {


    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.remove(3);
        System.out.println(ll1);
    }
}
