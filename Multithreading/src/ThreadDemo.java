//class ChildThread extends Thread{
//    @Override
//    public void run(){
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Child Thread and i:: " + i);
//        }
//    }
//}
//public class ThreadDemo {
//    public static void main(String[] args) {
//        //Every Java Program contains one Main thread and here Main method is One Thread
//        var childThreadObj1 = new ChildThread(); //Executed by Main thread so here Main Thread executes the Child Thread
//        // Above line is called Thread Instantiation
//        childThreadObj1.start();    // Main Thread executes this hence it starts the Child thread
//        // After above line where we just have one thread , now we will have two threads
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Executed BY Main Thread and i:: " + i);
//        }
//    }
//}
