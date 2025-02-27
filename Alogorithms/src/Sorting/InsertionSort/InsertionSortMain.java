package Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSortMain {
    public static int[] insertionSortWorkable(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp ) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,10,1,6,2};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
