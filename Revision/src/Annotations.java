@SuppressWarnings("all")
    // using this will supress warning here in the deprecated method being used
    // Using "deprecation" will not make warning go here
class Eagle {
    private String breed;
    private boolean canSwim;

    public void fly(){
        System.out.println("Fly");
    }

    private void eat(){
        System.out.println("eat");
    }

    @Deprecated
    public void dummy(){
        System.out.println("dummy");
    }
}

class UseEagle{
    Eagle eagle = new Eagle();

    @SuppressWarnings({"unused", "deprecation"})
    public void useDummy(){
        System.out.println("Inside use dummy");
        eagle.dummy();
    }

    public void useUnusedMethod() {
        System.out.println("unused method");
    }
}

@Deprecated
@SuppressWarnings("all")
class DeprecatedClass{
    public int getValue() {
        return 10;
    }
}

@SuppressWarnings("all")
class UseDeprecatedClass{
    DeprecatedClass obj = new DeprecatedClass();
}

@FunctionalInterface    // Throws error here that we have multiple Methods
interface functionalInterface{
    public boolean fly();
//    public void eat();    // as soon as this 2nd method is removed, @Functional Interface is a valid Annotation
}

public class Annotations {
    /*// 1. I can apply SuppressWarning at main method
    @SuppressWarnings(value = "deprecation")
    // Value should be correct and now whatever is deprecated we will not see that
    // Also it can be risky to apply at the Main level as we might want some warning to avoid run time issues*/

    // If we want to suppress all the Warnings
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.dummy();
    }
}
