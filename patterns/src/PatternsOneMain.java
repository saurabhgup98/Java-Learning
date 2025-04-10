public class PatternsOneMain {

    public static void PatternsOneMainQ1(int n){
        System.out.println("Q1");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void PatternsOneMainQ2(int n){
        System.out.println("Q2");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void PatternsOneMainQ3(int n){
        System.out.println("Q3");
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void PatternsOneMainQ4(int n){
        System.out.println("Q4");
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void PatternsOneMainQ5(int n) {
        System.out.println("Q5");
        for (int i = 1; i <= n; i++) {
            for (int j = n ; j >= i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void PatternsOneMainQ6(int n){
        System.out.println("Q6");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j <= n - i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void PatternsOneMainQ7(int n){
        System.out.println("Q7");
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
               if (j <= n - i){
                   System.out.print(" ");
               }else {
                   System.out.print(j);
               }
            }
            System.out.println();
        }
    }

    public static void PatternsOneMainQ8(int n){
        System.out.println("Q8");
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            int stars = (i < mid) ? i: n - i + 1;
            for (int j = 1; j <= stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PatternsOneMainQ1(5);
        PatternsOneMainQ2(5);
        PatternsOneMainQ3(5);
        PatternsOneMainQ4(5);
        PatternsOneMainQ5(4);
        PatternsOneMainQ6(5);
        PatternsOneMainQ7(4);
        PatternsOneMainQ8(5);
    }
}
