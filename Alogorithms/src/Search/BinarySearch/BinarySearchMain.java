package Search.BinarySearch;
public class BinarySearchMain {

    public static int getIndexOfTargetElementInSortedArray(int target, int[] arr){
        int start = 0;
        int end = arr.length - 1;

        if(target < arr[start] || target > arr[arr.length -1]){
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]) {
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static  void main(String[]  args) {

        int[] arrOne = {1,3,5,7,9,11,13,15};
        System.out.println(getIndexOfTargetElementInSortedArray(16, arrOne));
    }
}
