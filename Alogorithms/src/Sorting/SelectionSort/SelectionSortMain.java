package Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSortMain {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j ;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    /*Worst and best case Time complexity: O(Ne2)
    * Used in small Datasets and also where it requires less space as "it just uses O(1) extra space
    * Earlier sorting algorithms
    */
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
