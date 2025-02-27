package Search.BinarySearch;
public class BinarySearchMain {

    public static int getIndexOfProvidedElementInSortedArray(int eleToSearch, int[] arr){
        int indexToReturn = 0;
        boolean elementFound = false;
        int start = 0;
        int end = arr.length - 1;
        int mid = (int) (double) ((start + end) / 2);

        while (!elementFound) {
            if(eleToSearch == arr[mid]) {
                elementFound = true;
                indexToReturn = mid;
            }else {
                if(eleToSearch < arr[mid]) {
                   end = mid - 1;
                   mid = (start + end) / 2;
                }else {
                    start = mid + 1;
                    mid = (start + end) / 2;
                }
            }

        }
        return indexToReturn;
    }

    public static  void main(String[]  args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        System.out.println(getIndexOfProvidedElementInSortedArray(30,arr));
    }
}
