package Search.LinearSearch;

public class LinearSearchMain {
    // Q1: Search the given element in the array of Integers and return the index if exists else return -1
    public static int searchIndexOfProvidedElement(int eleToSearch, int[] arr) {
        int indexToReturn = -1;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i] == eleToSearch) {
              indexToReturn = i;
              break;
          }
        }
        return  indexToReturn;
    }

    public static void main(String[] args) {
        int[] arr = {12,7,9,10,12};
        System.out.println(searchIndexOfProvidedElement(101, arr));
    }
}
