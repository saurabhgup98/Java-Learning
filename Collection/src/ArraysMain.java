import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {
    public static int[] sortedNonDuplicateArr(int[] nums){
//        int[] outputArr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] != nums[i]){
                j++;
                nums[j] = nums[i + 1];
            }
        }
        return nums;
    }

    public static int[] removeVal(int[] nums, int val){
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[ i + 1] != nums[i]){
                if(nums[i + 1] != val ){
                    j++;
                    nums[j] = nums[i + 1];
                }
            }

        }
        return nums;
    }

    public static int[] push0ToEnd(int[] nums){
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //if current == 0 then do nothing
            //current != 0, nums[j] = nums[i]
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
;        }
       while (j < nums.length){
           nums[j] = 0;
           j++;
       }
        return nums;
    }

    public static int[] plusOneToArraySum(int[] nums){
//        String sumOfNumbers = "";
//        for(int num: nums){
//            sumOfNumbers+=num;
//        }
////        sumOfNumbers = BigInteger.toString(BigInteger.parseLong(sumOfNumbers) + 1);
//        sumOfNumbers = new BigInteger(sumOfNumbers).add(BigInteger.ONE).toString();
//        int[] resultArr = new int[sumOfNumbers.length()];
//        for (int i = 0; i < sumOfNumbers.length(); i++) {
//            resultArr[i] = Integer.parseInt(String.valueOf(sumOfNumbers.charAt(i)));
//        }
//        return resultArr;
        for (int i = nums.length - 1; i >=0 ; i--) {
            if(nums[i] < 9){
                nums[i] = nums[i] + 1;
                return nums;
            }
            nums[i] = 0;
        }
        nums = new int[nums.length + 1];
        nums[0] = 1;
        return nums;
    }

    public static void mergeTwoSortedArrays(int[] nums1, int m, int[] nums2, int n){
        int[] resArr = new int[m + n];
        for (int i = 0; i < n; i++) {
            resArr[i] = nums2[i];
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < resArr.length ; j++) {
                if (nums1[i] < resArr[j]) {
                    resArr[j] = nums1[i];
                    break;
                }
            }
        }


        System.out.println(Arrays.toString(resArr));
    }

    public static void main(String[] args) {
//        int[] nums = {0,1,0,7,9};
//        int[] nums = {0,1,0,0,9,6,7,9};
//        int[] nums = {1,2,4,6};

//        System.out.println(Arrays.toString(push0ToEnd(nums)));

//        ---------------------------------------------------------------------
        /*int[] nums = {9,9,9};
//        int[] nums = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(Arrays.toString(plusOneToArraySum(nums)));*/
//        ----------------------------------------------------------------------

        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        mergeTwoSortedArrays(num1,3,num2,2);


    }
}
