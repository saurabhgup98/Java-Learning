package PartOne;

import java.util.Arrays;

public class Main {
    //Q1: Get the Count of unique Elements in Ascending Sorted Array and let the array size be unchanged and non unique
    // elements after unique elements ie If array = [1,1,2,3,3,4,4} then O/P = {1,2,3,4,..anything} & o/p = 4
    // Note: size should not change 2) No extra space 
    public static int getSortedArraysUniqueElementsCount(int[] arr){
        int uniqueElementsCount = 1;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
           if(arr[i] != arr[j]) {
               j++;
               uniqueElementsCount++;
               arr[j] = arr[i];
           }
        }
        System.out.println(Arrays.toString(arr));
        return uniqueElementsCount;
    }

    public static void main(String[] args){
        int[] arrOne = {0,0,1,1,1,2,3,3,4};
        System.out.println(getSortedArraysUniqueElementsCount(arrOne));
    }
}
