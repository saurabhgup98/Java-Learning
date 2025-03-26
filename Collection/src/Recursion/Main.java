package Recursion;

public class Main {
    public static void msgOne(){
        System.out.println("msgOne:: " + "Hello World");
        msgTwo();
    }

    public static void msgTwo(){
        System.out.println("msgTwo:: " + "Hello World");
        msgThree();
    }

    public static void msgThree(){
        System.out.println("msgThree:: " + "Hello World");
    }

    public static void printNextThreeConsecNumbers(int n){
        System.out.println(n);
        printNextTwoConsecNumbers(n + 1);
    }

    public static void printNextTwoConsecNumbers(int n){
        System.out.println(n);
        printNextNumber(n + 1);
    }

    public static void printNextNumber(int n){
        System.out.println(n);
    }

    public static void main(String[] args) {
//       msgOne();
        printNextThreeConsecNumbers(1);
    }
}
