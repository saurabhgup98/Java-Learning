import java.util.List;

public class Main {
    // Problem one

    // Structured Approach
    public static void printAllNumbersInListTraditionalWay(List<Integer> numbers) {
        for(Integer num: numbers){
            System.out.println(num);
        }
    }

    // Programming Approach
    public static void print(int num){
        System.out.println(num);
    }

    public static void printAllNumbersInListFunctionalApproachPrintSeparated(List<Integer> numbers){
        numbers.forEach(Main:: print); // ;: method name is called as method reference
    }

    // Programming Approach Made much simpler
    public static void printAllNumbersInListFunctionalApproachPrintInclusive(List<Integer> numbers){
        numbers.forEach(System.out:: println); // System.out class contains static method println
    }
    //----------------------------------------------------------------------------------------------------------------------------

    // Question Two: Print even numbers from the List
    public static void printEvenNumbersInListTraditionalWay(List<Integer> numbers) {
        for(Integer num: numbers){
            if(num % 2 == 0){
                System.out.println(num);
            }

        }
    }

    // Programming Approach
    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static void printEvenNumbersInListFunctionalApproach(List<Integer> numbers){
        numbers.stream().
                filter(Main::isEven)
                .forEach(System.out::println);
    }

    // Programming Approach Made much simpler: ie use the Lambda Expression
    public static void printEvenNumbersInListFunctionalApproachUsingLambda(List<Integer> numbers){
        numbers.stream().
                filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    //--------------------------------------------------------------------------------------------------------------------------
    //Exercises
    //Q1: Find all odd numbers from the List
    public static void printOddNumbersFromTheList(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println);
    }

    //Q2: Print All courses from List individually
    public static void printCoursesFromList(List<String> courses){
        courses.forEach(System.out::println);
    }

    public static void printCoursesThatContainsSpring(List<String> courses){
        courses.stream()
                .filter(course -> course.toLowerCase().contains("spring".toLowerCase()))
                .forEach(System.out::println);
    }

    public static void printCoursesThatContainsMinFourLetters(List<String> courses){
        courses.stream()
                .filter(course -> course.length() > 3)
                .forEach(System.out::println);
    }

    public static void printSquareOfOddNumbersFromList(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    public static void printCubeOfAllEvenNumbers(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    public static void numberOfCharactersInEachCourse(List<String> courses){
        courses.stream()
                .map(course -> course + ":: " +  course.length())
//                .map(String::length)// simpler way if just to print length
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
/*
        System.out.println("------Q1: Structured way ---------------");
        printAllNumbersInListTraditionalWay(List.of(10,20,30,30,40,50));

        System.out.println("------Q1: Functional way separate print method ---------------");
        printAllNumbersInListFunctionalApproachPrintSeparated(List.of(10,20,30,30,40,50));

        System.out.println("------Q1: Simpler Functional way without separate print method ---------------");
        printAllNumbersInListFunctionalApproachPrintInclusive(List.of(10,20,30,30,40,50));
*/
        // Question Two
/*
        System.out.println("------Q2: Structured way ---------------");
        printEvenNumbersInListTraditionalWay(List.of(10,27,30,30,40,50, 51));

        System.out.println("------Q1: Functional way separate is Even method ---------------");
        printEvenNumbersInListFunctionalApproach(List.of(10,27,30,30,40,50, 51));

        System.out.println("------Q1: Simpler Functional way using Lambda & no separate even check method ---------------");
        printEvenNumbersInListFunctionalApproachUsingLambda(List.of(10,27,30,30,40,50, 51));
*/
        System.out.println("Exercise Q1: Odd Numbers from the list");
        printOddNumbersFromTheList(List.of(10,27,30,30,40,50, 51));

        System.out.println("Exercise Q2: Print courses from the list");
        printCoursesFromList(List.of("Spring","Spring Boot","API","Microservices","AMS"));

        System.out.println("Exercise Q3: Print courses from the list that contains spring");
        printCoursesThatContainsSpring(List.of("Spring","Spring Boot","API","Microservices","AMS"));

        System.out.println("Exercise Q4: Print courses from the list that has min 4 letters");
        printCoursesThatContainsMinFourLetters(List.of("Spring","Spring Boot","API","Microservices","AMS"));

        System.out.println("Exercise Q5: Print square of odd numbers from the list");
        printSquareOfOddNumbersFromList(List.of(10,27,30,30,40,50, 51));

        System.out.println("Exercise Q6: Print cube of even numbers from the list");
        printCubeOfAllEvenNumbers(List.of(10,27,30,30,40,50, 51));

        System.out.println("Exercise Q7: Print Length of each course");
        numberOfCharactersInEachCourse(List.of("Spring","Spring Boot","API","Microservices","AMS"));

    }
}
