import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        // Let's Import and Create object of Scanner class to Take input from the User
        Scanner scanner = new Scanner(System.in);

        // Declaration of Strings and Instantiation of Strings
        // NOTE: We can declare using the Same way we declare and instantiate Primitive Data
        // 1. Basic Way
        String myName = "Saurabh Gupta";
        System.out.println("The value of variable myName is:: " + myName);

        // Taking Input from the User
        //Let's see How we use to take "Integer" as Input from the User
/*
        System.out.println("Please Enter the Integer Number");
        int num1 = scanner.nextInt();
        System.out.println("The Number User entered is:: " + num1);
*/

        // Similarly we can Take String as Input but instead of "nextInt" =>    we have two other methods
        //1. Using next();
        System.out.println("Please Enter the String");
//        String str1 = scanner.next();
//        System.out.println("The String value input from user by NEXT method:: " + str1);

        String str2 = scanner.nextLine();
        System.out.println("The String value input from user by NEXTLINE method:: " + str2);




    }
}
