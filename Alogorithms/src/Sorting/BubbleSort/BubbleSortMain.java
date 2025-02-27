package Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortMain {

    public static int[] sortArrayUsingStandardBubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
              if(arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
              }
            }
        }
       return  arr;
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
        int[] fullyUnsortedArray = {5,4,3,2,1,10};
        System.out.println("The standard bubble sort method called " +
                Arrays.toString(sortArrayUsingStandardBubbleSort(fullyUnsortedArray)));
        System.out.println("----------------------------------------------------------------");

        int[] partiallySortedArray = {1,2,3,5,4};
        System.out.println("The optimized bubble sort method called " +
                Arrays.toString(sortArrayUsingOptimizedBubbleSort(partiallySortedArray)));
        System.out.println("----------------------------------------------------------------");

    }
}
