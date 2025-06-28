public class StringMethods {

    public static void main(String[] args) {
        String str1 = "Saurabh Sushil shupta";

        // Different Methods
        //1. length() => Check the Length of the String
        System.out.println("The Length of the String is:: " + str1.length());
        //NOTE
        // 1. In the Array also, We have the length Function to get the length of the Array
        // 2.   Difference :
        // a.       String we have length() that includes bracket after the method name
        // b.       Array we have a length without the parenthesis

        //2. charAt(int index) => To fetch the Character at index specified
        //NOTE:     Strings are Nothing but the Array of Characters and
        //              Hence String contains characters which can be accessed by specifying its index
        System.out.println("The character at index 2 is:: " + str1.charAt(2));
        System.out.println();


        //3a. indexOf(char character) => Fetch the First Occurrence of Specified Character
        System.out.println("The first occurrence of character a is at index:: " + str1.indexOf('a'));
        //3b. indexOf(String s) => Fetch the index from where the String starts if the string is present else return -1
        System.out.println("The index where string sush starts & do exists ::" + str1.indexOf("Sush"));
        System.out.println("The index if the string sush does not exists :: " + str1.indexOf("sush"));

        //4a. lastIndexOf() => Fetch the Last Occurrence of Specified Character
        System.out.println("The last occurrence of Specified Character is:: " + str1.lastIndexOf('a'));
        //4b. lastIndexOf(String s) =>
        System.out.println("The index where String starts Last occurrence and exists is:: " + str1.lastIndexOf("sh"));
        System.out.println("The index where string does not exists :: " + str1.lastIndexOf("Sh"));
        System.out.println();

        // compareTo() => returns
        //                  0 if two strings are equal
        //                  return negative or -1 if str1  lexicographically smaller then str2
        //                  return positive if str1 lexicographically greater then str2
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "abf";
        String s4 = "abb";
        System.out.println("Using compareTo Method");
        System.out.println("compare s1 to s2 " + s1.compareTo(s2));
        System.out.println("compare s1 to s3:: " + s1.compareTo(s3));
        System.out.println("compare s1 to s4:: " + s1.compareTo(s4));

        // contains(String s) => check if String contains the subset of the same String i.e. Single char or Multiple character
        System.out.println("contains compare :: " + str1.contains("Sau"));

        //startsWith(String s) => check if the Str
        System.out.println("check starts with " + str1.startsWith("Sa"));

    }
}
