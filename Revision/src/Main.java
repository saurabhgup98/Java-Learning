public class Main {
    // nth fibonnaci number
    //Factorial 5!
//    0 1 1 2 3 5 8 13
    public static int findNthFibonacciNumberWithoutRecursion(int n){
        int result = 0;
        if(n == 1){
            result = 1;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public static int findNthFibonacciUsingRecursion(int n){
        // Base Condition
        if(n < 2){
            return n;
        }
        return findNthFibonacciUsingRecursion(n - 1) + findNthFibonacciUsingRecursion(n - 2);
    }

    public static int findFactorial(int n){
        if(n == 1){
            return 1;
        }
        return n * findFactorial(n - 1);
    }

    public static int factorialFour(){
        return 4 * factorialThree();
    }

    public static int factorialThree(){
        return 3 * factorialTwo();
    }

    public static int factorialTwo(){
        return 2 * factorialOne();
    }

    public static int factorialOne(){
        return 1;
    }

    public static int binarySearchUsingRecursion(int target, int[] arr, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (end + start) / 2;
        if(target < mid) {
            return binarySearchUsingRecursion(target,arr,start,mid -1);
        }
        if(target == mid){
            return mid;
        }
        return binarySearchUsingRecursion(target,arr,mid+ 1,end);
    }

    public static void printNto0(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNto0(n - 1);
    }

    public static void print0toN(int n, int start){
        System.out.println(start);
        if(start == n){
            return;
        }
        print0toN(n,start+ 1);
    }

    public static void printNto0Rev(int n){
        if(n == 0){
            return;
        }
        printNto0Rev(n - 1);
        System.out.println(n);
    }

    public static int sumOfDigitsOfNumberWithoutRecursion(int n){
        int result = 0;

        while ((int) n / 10 != 0){
            result+= n % 10;
            n = n / 10;
        }
        result+=n;
        return result;
    }

    public static int sumOfDigitsOfNumberWithRecursion(int n){
        if(n == 0){
            return 0;
        }
        return n % 10 + sumOfDigitsOfNumberWithRecursion(n / 10);
    }

    public static int productOfDigitsOfNumberWithRecursion(int n){
        if(n == 0){
            return 1;
        }
        return n % 10 * productOfDigitsOfNumberWithRecursion(n / 10);
    }

    public static int reverseTheNumber(int n){
        if(n == 0){
            return n;
        }
        return Integer.parseInt((Integer.toString(n % 10) + reverseTheNumber(n / 10)).
                substring(0,Integer.toString(n).length()));
    }

    private static int sum = 0;
    public static int reverseTheNumberWayTwo(int n){
        if(n == 0){
            return sum;
        }
        return sum * 10 + reverseTheNumberWayTwo(n / 10);
    }


    public static void main(String[] args) {
//        System.out.println(findNthFibonacciNumberWithoutRecursion(8));
//        System.out.println(findNthFibonacciUsingRecursion(4));
        System.out.println(findFactorial(4));
        System.out.println(factorialFour());
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearchUsingRecursion(7,arr,0, arr.length - 1));

        System.out.println("-------------------");

//        printNto0(5);
//        print0toN(5,0);
//        printNto0Rev(5);
        System.out.println(sumOfDigitsOfNumberWithoutRecursion(12345));
        System.out.println(sumOfDigitsOfNumberWithRecursion(1234));
        System.out.println(productOfDigitsOfNumberWithRecursion(2345));
        System.out.println(reverseTheNumber(1234));
    }
}
