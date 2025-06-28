package PartOne;

import java.util.Scanner;

public class LoopMain {
    public static int countOfDigitsOfNumber(int num){
        if (num == 0){
            return 0;
        }

        return countOfDigitsOfNumber(num / 10) + 1;
    }

    public static int sumOfDigitsOfNumber(int num){
        if (num == 0){
            return 0;
        }
        return num % 10 + sumOfDigitsOfNumber(num / 10);
    }

    public static int reverseTheDigitsOfNumber(int num){
        int placeValue = String.valueOf(num).length() - 1;
        int numInReverse = 0;
        while (num != 0){
            numInReverse+= num % 10 *  (int) Math.pow(10,placeValue);
            placeValue--;
            num = num / 10;

        }
        return numInReverse;
    }

    public static int reverseDigitOfNumberUsingRec(int num, int sum){
        if(num == 0){
            return sum;
        }
        return sum+= (sum * 10 + num % 10) + reverseDigitOfNumberUsingRec(num / 10, sum);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = scanner.nextInt();

//        System.out.println("Calculate result of countOfDigitsOfNumber");
//        System.out.println(countOfDigitsOfNumber(num));
//        System.out.println("Calculate Result of sumOfDigitsOfNumber");
//        System.out.println(sumOfDigitsOfNumber(num));
        System.out.println("Calculate the Result of reverseTheDigitsOfNumber");
        System.out.println(reverseTheDigitsOfNumber(num));
        System.out.println(reverseDigitOfNumberUsingRec(123,0));

    }
}
