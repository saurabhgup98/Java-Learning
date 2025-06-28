package Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortMain {
    // Basically Sorting one element in one Outer loop Bubbling either largest or Smallest in end or start

    // PROBLEM STATEMENT => SORT ARRAY IN ASCENDING ORDER SAY ARRAY IS {5,4,3} SORT TO {3,4,5} LENGTH = 3
    // UNDERSTANDING BUBBLE SORT =>
    // *    WE HAVE TO RUN OUTER LOOP SUCH THAT ON EVERY LOOP COMPLETION ONE ELEMENTS BUBBLE OUT (SORTED)
    // *    FOR ASCENDING SORTED WE WANT LARGEST TO END
    // **       SO ON 1ST LOOP COMPLETION, LARGEST ELEMENT AT INDEX 2 (ELE AT INDEX 1 AND 0 MAY BE UNSORTED)
    // **       ON 2ND LOOP COMPLETION, LARGEST ELEMENT AT INDEX 1 (BCOZ 1 ELEMENT LEFT THAT WE CAN SAY IS SORTED)

    // OBSERVATIONS =>
    // *    OUTER LOOP RUNS (LENGTH - 1) TIMES SO (i < length - 1)
    public static int[] sortArrayUsingStandardBubbleSort(int[] nums) {
        // Let's run outer loop nums.length -2 times i.e. If the Length is 3 so i < 2 then it should run 2 times only
        // for index 0th and 1st index
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] > nums[ j + 1]){
                    int temp = nums[ j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static int[] sortArrayUsingOptimizedBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[ j + 1]) {
                    int temp = arr[ j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                System.out.println("the value of i is" + i);
                break;
            }
        }
        return arr;
    }

    //Bst case time complexity: Already sorted array: o(N)
    // Worst case time complexity: unsorted in Descending order like 5,4,3,2,1 : O(Ne2)

    public static void main(String[] args) {
        int[] fullyUnsortedArray = {5,4,3,2,1,10,6};
        System.out.println("The standard bubble sort method called " +
                Arrays.toString(sortArrayUsingStandardBubbleSort(fullyUnsortedArray)));
        System.out.println("----------------------------------------------------------------");

        int[] partiallySortedArray = {1,2,3,5,4};
        System.out.println("The optimized bubble sort method called " +
                Arrays.toString(sortArrayUsingOptimizedBubbleSort(partiallySortedArray)));
        System.out.println("----------------------------------------------------------------");

    }
}
