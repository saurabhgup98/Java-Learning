package Recursion;

public class RecursionRev {
    private static int nthFibonacci(int n, int start){
       if (start > 5){
           return 0;
       }
       return nthFibonacci(n,start) + nthFibonacci(n,start + 1);
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(5, 1));
    }
}
