package LearnConstructor;

class Student {
    String name;
    int age;

    // Let's create the Possible Constructor
    // 1. No args Constructor
    Student(){
        // We could have given the empty body which "if constructor without args is called" then name and age is null, 0
        // But what is the use of such constructor then => "Actually to initialize if no value is provided"
        this.name = "no Name Provided";
        this.age = 5;
    }

    //2. All args Constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 3. If only one is Provided say name and age we will initialize to default
    Student(String name){
        this.name = name;
        // Below we don't need to write if we want that if no value is provided then age is 0 which not right
        this.age = 20;
    }
}

public class LearnConstructor {
    public static void main(String[] args) {
        var stdOne = new Student();
        System.out.println("No arg is Provided and initialized some value of name and age if no arg is provided");
        System.out.println(stdOne.name);
        System.out.println(stdOne.age);

        System.out.println("If both the args is Provided");
        var stdTwo = new Student("Saurabh", 31);
        System.out.println(stdTwo.name);
        System.out.println(stdTwo.age);

        System.out.println("If only name is provided but age is getting default from body of constructor");
        var stdThree = new Student("Rashi");
        System.out.println(stdThree.name);
        System.out.println(stdThree.age);
    }
}
