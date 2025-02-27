package LearnStatic;

public class Human {
    static long population; // static Variables are initialized:: Before any object of class is created

    String name;
    int age;
    int salary;
    boolean isMarried;

    public Human(String name, int age, int salary, boolean isMarried) {
        // No need to specify static variable here if there is no initialization logic needed but
        // We want to increment population by 1 when any object is created & hence
        population++;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public void nonStaticMethod() {
        System.out.println("I am non static method and can be called using instance of human class");
    }

    public static void staticMethod() {
        System.out.println("I am a static Method");
    }
}
