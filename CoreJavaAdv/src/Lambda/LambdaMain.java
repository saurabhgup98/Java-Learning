package Lambda;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Implementing Runnable Interface's run method without lambda in separate class");
    }
}

@FunctionalInterface
interface MathOperation {
    int operate(int num1, int num2);
}

public class LambdaMain {
    public static void main(String[] args){

    Thread t1 = new Thread(new Task());
    t1.start();

    Thread t2 = new Thread(() -> System.out.println("Implementing runnable interfaces run method using lambda"));
    t2.start();

    MathOperation sumOperation = (int num1, int num2) ->  num1 + num2;
    System.out.println(sumOperation.operate(20,30));

    MathOperation sumOperationTwo = Integer::sum;
    System.out.println(sumOperationTwo.operate(10,30));

// Note: Both way we can write the sum ie implement the

    }
}
