package LearnStatic;

import static LearnStatic.Human.staticMethod;

public class StaticMain {
    public static void main(String[] args) {
        System.out.println("Value of static variable when no object created:: " + Human.population);
        Human perOne = new Human("Saurabh", 30, 100000, false);
        System.out.println("Value of static variable when 1st object created:: " + Human.population);
        Human perTwo = new Human("Akash",36,80000, true);
        System.out.println("Value of static variable when 2nd object created:: " + Human.population);

/*      Hence Basic Definition of Static:
        * Static belongs to class and not individual object
        * Static Variable/Method is initialized/run before any object is created
        * Hence, the "Main Method is static" => because it runs before any object is created ie there is no object of main method
*/

       // nonStaticMethod();   // Not allowed even import cannot do
        staticMethod();  // we can import and use it

/*
        CONCLUSION: ** Non-static Method cannot be called inside the static Method without creating an instance **
                Hence,
                    nonStatic Method we can call using instance once the instance is created
                    static method can be called directly without needing object creation
*/

        perOne.nonStaticMethod();
        System.out.println("-------------------------------------------------------------");



        System.out.println("Value of a is:: " + StaticBlock.a + " & value of b is:: " + StaticBlock.b);
        StaticBlock.b = 12;
        System.out.println("Value of a is:: " + StaticBlock.a + " & value of b after updation here is is:: " + StaticBlock.b);

        // We can see only 1st time the print statement & also initialization => for the static block

        StaticBlock objOne = new StaticBlock();
        System.out.println("After First object created => Value of a is:: " + StaticBlock.a + " & value of b is:: " + StaticBlock.b);
        // We can initialize the value also once if we update here once then for any object it will be updated once until we change

        System.out.println("-------------------------------------------");


        var nameOne = new InnerAndOuterClass.InnerClass("Rashi");
        var nameTwo = new InnerAndOuterClass.InnerClass("Rashmi"); // These methods will work if Inner class is static
        System.out.println("Value of name one is:: " + nameOne.name);
        System.out.println("Value of name Two is:: " + nameTwo.name);

        // We learn that static class, Variables does not depends on Object ie correct
        // But it can have Identity of its own.

    }
}
