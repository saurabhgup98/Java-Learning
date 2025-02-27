package LearnStatic;

public class InnerAndOuterClass { // This is the topmost and oute class and it cannot be static ie static public class name(not Allowed)
    static public class InnerClass {
        String name;

        public InnerClass(String name) {
            this.name = name;
        }
    }
}
