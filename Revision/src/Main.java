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

    public static int reverseTheNumber(int n){
        if(n == 0){
            return n;
        }
        return Integer.parseInt((Integer.toString(n % 10) + reverseTheNumber(n / 10)).
                substring(0,Integer.toString(n).length()));
    }

    public static void main(String[] args) {
//        System.out.println(findNthFibonacciNumberWithoutRecursion(8));
//        System.out.println(findNthFibonacciUsingRecursion(4));
//        System.out.println(findFactorial(4));
//        System.out.println(factorialFour());
//        int[] arr = {1,2,3,4,5,6,7,8};
//        System.out.println(binarySearchUsingRecursion(7,arr,0, arr.length - 1));




    }
}
