package Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        // Let's construct the Array List
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Similarly we can construct the Stacks Just Replace ArrayList -> Stack
        Stack<Integer> stack1 = new Stack<>();

        // We can write Using the Parent Interface also
        List<Integer> stack2 = new Stack<>();

        //1. Let's add the elements using the push method
        stack1.push(12);
        stack1.push(13);
        stack1.push(14);
        stack1.push(15);
        stack1.push(16);

        System.out.println("Stack one after adding 5 elements" + stack1);

        //Let's remove the element using the pop method
        stack1.pop();

        System.out.println("Stack 1 after using pop first time after adding 5 elements" + stack1);
        // we added 16 in last/Latest which will be removed

        //Let's check the last element added or to come in
        System.out.println("Last element inside the stack :: " + stack1.peek());

        //Let's check the Size of the Stack
        System.out.println("The size of the stack is :: " + stack1.size());
    }
}
