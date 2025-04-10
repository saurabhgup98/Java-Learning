package methodoverloading;

class OverloadingSub {

}

public class OverloadingMain {
    public int methodOne() {
        return 10;
    }

    public int methodOne(int num1, int num2) {
        return 10;
    }

    public int methodOne(int num1) {
        return 10;
    }

    public int methodOne(double num1) {
        return 10;
    }

    //Not allowed Below One
/*    public int methodOne(int num2, int num1){
        return 10;
    }
*/

    public int methodOne(int num1, double num2) {
        return 10;
    }

    // Again below is not allowed
/*   public void methodOne(){
        System.out.println("Method One");
    }
*/

    public static void main(String[] args) {

    }
}
