package ArrayQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OneMain {
    public static int removeDuplicatesInPlace(int[] nums){
        int result = 1;
        if(nums.length == 0){
            result = 0;
            return result;
        }
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
                result++;
            }
        }
        return result;
    }

    public static int removeOccuranceOfVal(int[] nums, int val){
        if (nums.length == 0){
            return 0;
        }
        int result = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
               nums[j] = nums[i];
               j++;
               result++;
            }
        }
        return result;
    }

    public static int indexOfFirstOccuranceOfStrInStr(String haystack, String needle){
        if(needle.length() > haystack.length()){
            return -1;
        }
        haystack = haystack.toLowerCase();
        needle = needle.toLowerCase();
        for (int i = 0; i < haystack.length(); i++) {
            int result = i;
            boolean isMatch = true;
            for (int j = 0; j < needle.length() ; j++) {
                System.out.println("before J:: " + i);
              if (needle.charAt(j) != haystack.charAt(i + j)){
                  System.out.println("after j::" + i);
                  isMatch = false;
                  break;
              }
//              i+= (i < haystack.length() - 1) ? 1:0;
//                System.out.println("end I: " + i);

            }
            if (isMatch){
              return result;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
//        System.out.println(removeDuplicatesInPlace(new int[]{1,1,2,5,5,7,9,9}));
//        System.out.println(removeOccuranceOfVal(new int[] {3,2,2,3,5}, 3));
        System.out.println(indexOfFirstOccuranceOfStrInStr("mississippi","issip")); // i = 9 j = 4 res = 4 issip

    }
}
