package PartOne;

import java.util.ArrayList;
import java.util.List;

public class BasicProblemsOne {

    public static void swapTwoInt(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a is:: " + a + " b is :: " + b + " after swap") ;
    }

    public static void swapTwoINtUsingSumAndDifferenceMethod(int a, int b){
        a = a + b; // This makes say a = 3  b = 9 then this becomes 12
        b = a - b;  // 12 -9 = 3 so b got 3
        a = a - b; // new Value of b = 3 and a we changed to 12 then 12 - 3= 9 old value of b
    }

    public static int subset(int[] arr){
        List<Integer> arList = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {

            if(arr[i + 1] >= arr[i]){
                System.out.println(arr[i + 1]);
                System.out.println(arr[i]);
                System.out.println();

                int eleCount = 2;
                int k = i + 1;
                for (int j = i + 2; j < arr.length; j++) {
                    if(arr[j] > arr[k]){
                        eleCount++;
                        k++;
                    }
                }
                arList.add(eleCount);
            }
        }
        System.out.println(arList);
        int max = 0;
        for(var ele : arList){
            if(ele > max) {
                max = ele;
            }
        }
        return max;
    }

    public static void main(String[] args) {

//        swapTwoInt(10,20);
        System.out.println(subset(new int[] {4,3,5,1,6}));
    }
}
