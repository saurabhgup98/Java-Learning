package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayQuestionsOne {
    //1. Target Sum : Given array pair == target say arr = {4,6,5,3,8,2} target = 7 then we have two pairs {4,3} and {5,2}
    public static int twoSumPairs(int[] nums, int target){
        int totalPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    totalPairs++;
                }
            }
        }
        return totalPairs;
    }

    //2.a Array Manipulation
    // Find Unique number in the Array while except one all elements are repeated twice
    public static int uniqueNumberInArray(int[] nums){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           if(mp.containsKey(nums[i])){
               mp.put(nums[i], mp.get(nums[i]) + 1);
           }else {
               mp.put(nums[i],1);
           }
        }
        System.out.println(mp);
        for(var ele: mp.keySet()){
            if(mp.get(ele) == 1){
                return ele;
            }
        }
        return 0;
    }

    //2b. Solve using Array
    public static int uniqueNumberInArrayUsingArrays(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            boolean notRepeated  = true;
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    notRepeated = false;
                    break;
                }
            }

            if(notRepeated){
                return nums[i];
            }

        }
        return 0;
    }

    //3. Find 2nd Max element in the Array
    private static int[] swapElementsOfArray(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
        return nums;
    }

    private static int findMax(int[] nums){
        int maxElement = Integer.MIN_VALUE;
        for (var currentEle: nums){
            if (currentEle > maxElement){
                maxElement = currentEle;
            }
        }
        return maxElement;
    }

    public static int findSecondMaxElement(int[] nums){
        int maxElement= findMax(nums);
        int secondMaxElement = nums[0];
        for(var ele : nums){
            if (ele < maxElement){
                secondMaxElement = ele;
                break;
            }
        }

        for (var currentEle: nums){
            if (currentEle > secondMaxElement){
                if (currentEle < maxElement){
                    return currentEle;
                }
            }
        }
        return secondMaxElement;
    }

    public static int firstElementThatRepeats(int[] nums){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (var ele : nums){
            if (mp.containsKey(ele)){
                mp.put(ele,mp.get(ele));
                    return ele;
            }else {
                mp.put(ele,1);
            }
        }
        return -1;
    }
    //The above example using array needs two loops and checking pair i and all j from 0 to n - 1 - i

    public static int[] swapTwoElementsInInteger(int[] nums, int i, int j){
        nums[i]= nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
        return nums;
    }

    public static int[] reverseArray(int[] nums){
        int start = 0; // 0
        int end = nums.length - 1 ;
        while (end > start){
            swapElementsOfArray(nums, start, end);
            start++;
            end--;
        }
        return nums;
    }

    // Find the Position of element in array and If element not inserted find its Position where it should be inserted
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || target <= nums[0] ){
            return 0;
        }
        if (target > nums[nums.length - 1]){
            return nums.length;
        }
        if (target == nums[nums.length - 1]){
            return nums.length - 1;
        }
        if (nums.length == 2){
            return 1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == nums[mid] || (target < nums[mid] && target > nums[mid - 1]) ){
                return mid;
            }  else if (target > nums[mid] && target < nums[mid + 1]) {
                return mid + 1;
            } else {
                if(target < nums[mid]){
                   end = mid - 1;
                }else {
                   start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && nums1.length == 1){
            nums1[0] = nums2[0];
            return;
        }
        if (n == 0){
            return;
        }
        int[] arr = new int[nums1.length];
        int mIdx = 0; // 1
        int nIdx = 0; // 0
        for (int i = 0; i < nums1.length; i++) { //{1} 1,2,3   2,5,6
            if (nums1[mIdx] <= nums2[nIdx] && m != 0){
                arr[i] = nums1[mIdx];
                mIdx++;
            }else {
                arr[i] = nums2[nIdx];
                nIdx++;
            }
            if (nIdx >= n){
                i++;
                while (i < nums1.length){
                    arr[i] = nums1[mIdx];
                    mIdx++;
                    i++;
                }
            }
            if (mIdx >= m){
                i++;
                while (i < nums1.length){
                    arr[i] = nums2[nIdx];
                    nIdx++;
                    i++;
                }
            }
        }
        nums1 = arr;
        System.out.println(Arrays.toString(nums1));
        arr = new int[0];
    }

    public static int findSpecialInteger(int[] arr) {
        int itemCount = 1;
        for (int i = 1; i < arr.length; i++) { //{1,2,2,6,6,6,6,7,10}
            if (arr[i] == arr[i - 1]){
                itemCount++;
                if (itemCount > (int) (0.25 * arr.length)){
                    return arr[i - 1];
                }
            }else {
                if (itemCount > (int) (0.25 * arr.length)){
                    return arr[i - 1];
                }
                itemCount = 1;
            }
        }
        return arr[0];
    }


    public static void main(String[] args) {
//        System.out.println(twoSumPairs(new int[] {4,6,3,5,8,2}, 7));
//
//        System.out.println(uniqueNumberInArray(new int[] {1,2,3,4,1,2,3}));
//        System.out.println(uniqueNumberInArrayUsingArrays(new int[] {1,2,3,4,1,2,3}));
//        System.out.println(findSecondMaxElement(new int[] {8,7,6,7,9,10}));
//        System.out.println(findSecondMaxElement(new int[] {-1,-2,-1,-3,-1,-4}));
//        System.out.println(firstElementThatRepeats(new int[] {1,5,3,4,6,1,3,4}));
//        System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5}))); // 5,4,3,2,1

//        System.out.println(searchInsert(new int[] {1,2,3,4,5,10}, 2)); // s: 0 e: 1 m: 2(3)
//        merge(new int[] {-1,0,0,3,3,3,0,0,0}, 6, new int[] {1,2,2}, 3);
        System.out.println(findSpecialInteger(new int[] {1, 2,3,3}));


    }
}
