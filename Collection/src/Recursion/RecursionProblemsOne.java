package Recursion;

public class RecursionProblemsOne {
    // Q1:
    public static void print0ToN(int n, int start){
        if (start == n){
            return;
        }
        System.out.println(start);
        print0ToN(n,start + 1);
    }

    // Q1A:
    public static void print0ToNWithoutStartAttribute(int n){
        // Check the Base condition when the same fn should not be called
        if(n == 0){
            return;
        }

        // Do the Output & call the fn should be 2nd and 3rd step. But if we call now , then it can print n and then
        // reduce but we want reverse , hence reverse the steps

        // 2n step : Call the fn
        print0ToNWithoutStartAttribute(n - 1);
        System.out.println(n);

    }

    //Q2:
    public static void printNto0(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNto0(n - 1);
    }

    //Q3: Print sum of numbers of input say n = 12345 then o/p = 15 similarly if n = 12 then o/p = 3
    public static int printSumOfDigitsOfInput(int n){
        if(n / 10 == 0){
            return 1;
        }
        return n % 10 + printSumOfDigitsOfInput(n / 10 );

    }

    //Q4: Print product of numbers of input say n = 123 then o/ p = 1*2*3 = 6
    public static int productOfDigitsOfInput(int n){
        if (n / 10 == 0){
            return 1;
        }
        return n % 10 * productOfDigitsOfInput(n / 10);
    }

    //Q5: Product of n to 1 i.e. if n = 4 then (4 * 3* 2 * 1)  print(24)
    public static int factorial(int n){
       if( n == 1){
           return 1;
       }
       return n * factorial(n - 1);
    }

    //Q6: Sum of n to 1 i.e. if n = 4 then result = 10
    public static int printSumOfNto1(int n){
        if(n == 0){
            return 0;
        }
        return n + printSumOfNto1(n - 1);
    }

    //Q7: Reverse the Number
    static int sumOfRevOfNumber = 0;
    public static int reverseTheNumber(int n){
        if(n == 0){
            return 1;
        }

        return sumOfRevOfNumber += n % 10;
    }

    public static void main(String[] args) {
//        print0ToN(5,1);
//        printNto0(5);
//        print0ToNWithoutStartAttribute(5);

//        Q3::
//        System.out.println(printSumOfDigitsOfInput(12345));
//        System.out.println(productOfDigitsOfInput(1234));
//        System.out.println(factorial(5));
//        System.out.println(printSumOfNto1(6));

//        Q7
        System.out.println(reverseTheNumber(123));
    }
}
