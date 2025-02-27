package LearnStatic;

public class StaticBlock {
    static int a = 10;
    static int b;

    static {
        System.out.println("Static Block initialized and setting the value of B");
        b = a * 10;
    }

}
