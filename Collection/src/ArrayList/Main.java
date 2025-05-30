package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        // Note:    By Default Initial Capacity is 10
        //          So if 11th element needs to be inserted, It creates new array of 1.5 times current capacity &
        //          copy all elements in the newly created array

        // ISSUE:   we know that at least 10 Million Data will be stored. So everytime it creates a new array and copy
        //          all elements, It is Time complex

        // SOLUTION: Specify Initial Capacity
        List<Integer> arrListTwo = new ArrayList<>(100);
        // NOTE:    Though we have created capacity of 100, still we can only insert element in continuous ie if only
        //          1 element is there, then 2nd element has to be at 1st index irrespective of initial Capacity

        // NOTE:    Suppose we specified or not specified initial capacity say 10 and then 11th element is added,
        //          Now suppose I remove 11th element , still The Internal Capacity of Array will be 15 Only ie 1.5 times of 10

        // NOTE: We can trim the initial capacity to save memory, Not that Important.

        arrListTwo.add(17);
        arrListTwo.add(18);

        // Other Ways of creating the Array List
        List<Integer> arrListThree = List.of(12,36,78);
       // We cannot Modify(Add or set) the Array List created Using List.of();

        // WE can also create the array List out of array but its size will be Non-Modifiable
        List<String> arrListFour = Arrays.asList("str1","str2");
        // arrListFour.add("str3");  // Throws run time error
        arrListFour.set(0,"str0");
        System.out.println("Array List using arrays:: " + arrListFour);

        arrList.add(10); // returns true or false
        arrList.add(12); // We cannot skip the index like for every element it increases the space by 1 so if there are
        //2 elements and we want to insert third element then it has to be added at index 2 and not 4 or 5
        arrList.add(5);
        arrList.add(10);
        arrList.addLast(143); // Note: add without index and addLast does the same work append element in the last

        arrList.set(2, 7000); // This method replaces the element at specified index & throw the bound error if index not exists
        arrList.add(4,999); // This method checks if the index exists and if not then check it should not
        // throw index Bound error and if both true then add at provided element. If index exists already then it add
        // at provided position and push further elements at one index extra
        arrList.add(4,888);
        arrList.addFirst(123);

        arrList.addAll(arrListTwo);
        arrList.addAll(4,arrListTwo);


        arrList.remove(1);
        arrList.removeFirst();
        arrList.removeLast();
        arrList.removeAll(arrListTwo); // wherever there is collection added it will remove that from all places


        System.out.println();
        System.out.println("-------------------  Inspecting the Array List ----------------------");
        System.out.println("Check the arrayList is empty or not :: " + arrList.isEmpty());
        System.out.println("The Size of the arrayList :: " + arrList.size());
        System.out.println("Check in the arrayList if 10 exists at least once ::  " + arrList.contains(10) );
        System.out.println("Fetch the hash code of the array List:: " + arrList.hashCode());
        System.out.println("Check if two array List are Equal:: " + arrList.equals(arrListTwo));

        System.out.println();
        System.out.println("-----------------Fetch index or element --------------------------------");
        System.out.println("Check in the arrayList first occurrence of 10(element) else return -1:: " +
                arrList.indexOf(10));
        System.out.println("Check in the arrayList last occurrence of 10 else return -1:: " +
                arrList.lastIndexOf(10));

        System.out.println("Fetch element at 2nd index is using get() method :: " + arrList.get(2) +
                " Note: give index in get() method not out of range ie search element at 2 then its size should be least 3" );
        System.out.println("Fetch First element of the arrayList:: " + arrList.getFirst());
        System.out.println("Fetch Last element of the arrayList:: " + arrList.getLast());


        // arrList.clear();  // Clears all the element from the Array List
        System.out.println("Array List can be converted to Array using method toArray() & array can be converted to string instead of loop" +
                Arrays.toString(arrList.toArray()));
        System.out.println("" + (arrList.listIterator()));


        // The methods which are protected in extendable or other class inside the array List methods are
        /*clone():: The method protected in Object class since it returns Object. we can override in child class and use the same
        * */


    }
}
