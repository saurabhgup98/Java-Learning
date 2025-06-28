public class Arrays {
    public static void main(String[] args) {
        // Ways to Declare a 2-D Array
        // Suppose I want to Declare an Array of Age which is of Integer Data Type
        int[] studentsAge;

        // Let's Initialize the Array with the "New" Keyword and Provide its size
        studentsAge = new int[5];
        studentsAge[0] = 21;

        //Let's declare and Initialize the Array in One Line
        int[] studentsAgeOfClass = new int[5];

        Object[] obj = new Object[5];
        obj[0] = 10;
        obj[1] = .5;
        obj[2] ="Saurabh";
        obj[3] = true;
        obj[4] = 33333333333333333L;
    }
}
