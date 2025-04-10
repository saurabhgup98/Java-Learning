package Search.BinarySearch;

public class BinarySearchProblemsOne {
/*    Q1: Find the Ceiling of the Target Element from the sorted array
    SSay if array is [1,5,7,9,11,13,14]
      a. Target = 13 then ceiling is 13
      b. Target = 12 the ceiling is 13
*/
    public static int searchCeilingOfArrayWithoutRecursion(int target, int[] arr){
        if(arr.length == 0){
            return -1;
        }else if(target < arr[0]){
            return arr[0];
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[ mid] || (target < arr[ mid] && target > arr[ mid - 1])){
                return arr[mid];
            }else if( target < arr[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrOne = {1,3,5,7,9,11,13,14};
//        int[] arrOne = {};
        System.out.println(searchCeilingOfArrayWithoutRecursion(15,arrOne));
    }
}
