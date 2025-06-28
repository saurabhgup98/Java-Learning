import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        /*Class<?> eagleClass = Eagle.class;
        System.out.println("The name of the class is:: " + eagleClass.getName());
        System.out.println("The Modifiers List of Eagle class  is:: " + Modifier.toString(eagleClass.getModifiers()));
        System.out.println("The list of fields in the classes are :: " + Arrays.toString(eagleClass.getFields()));
        System.out.println("The list of declared fields in the classes are :: "
                + Arrays.toString(eagleClass.getDeclaredFields()));
//
//        System.out.println("The list of public methods in Eagle class and Object class are :: " +
//                Arrays.toString(eagleClass.getMethods()));
        // returns only public methods of Class Eagle and along with it returns the methods like wait, notify etc.
        // of Parent class viz object

        // To get all the methods of only Eagle class
        System.out.println("The List of all methods declared inside the Eagle class is:: " +
                Arrays.toString(eagleClass.getDeclaredMethods()));
        System.out.println("The ");
        System.out.println("The list of constructors are :: " + Arrays.toString(eagleClass.getConstructors()));

//        Method[] methods = eagleClass.getMethods();
//        for(var method: methods){
//            String methodName = method.getName();
//
//            System.out.println("The name of the method is:: " +  methodName + " and its details are ::");
//            System.out.println("Return type of the method is :: " + method.getReturnType());
//            System.out.println("The Class name where all methods are :: " + method.getDeclaringClass());
//            System.out.println("*********");
//        }*/
        Eagle eagle = new Eagle();
        eagle.dummy();
    }
}
