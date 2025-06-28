package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashmapQuestionsOne {

    //Q1: Given array most frequent element in it
    static int fetchMostFrequentElementInArray(int[] arr){
        Map<Integer,Integer> mp = new HashMap<>();
        int maxFrequentValue = 0;
        int keyForMostFrequentValue = 0;
        for (var ele: arr){
            //if key ie. element not exists then add key with value 1
            if(mp.containsKey(ele)){
                mp.put(ele,mp.get(ele) + 1);
            }else {
                mp.put(ele,1);
            }
            // else increment  value with corresponding key by  1
        }
        for (var entry: mp.entrySet()){
            if (entry.getValue() > maxFrequentValue){
                maxFrequentValue = entry.getValue();
                keyForMostFrequentValue = entry.getValue();
            }
        }
        return keyForMostFrequentValue;
    }

    private static HashMap<String,Integer> countFreqOfWordsInString(String s1){
        HashMap<String,Integer> mp1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            String charAtI = String.valueOf(s1.charAt(i)).toLowerCase();
            if(mp1.containsKey(charAtI)){
                mp1.put(charAtI, mp1.get(charAtI) + 1);
            }else {
                mp1.put(charAtI, 1);
            }
        }
        return mp1;
    }

    private static void addOrUpdateEntry(Character keyOfCharType, Map<String,Integer> mp){
            String key = String.valueOf(keyOfCharType).toLowerCase();
            if(mp.containsKey(key)){
                mp.put(key, mp.get(key) + 1);
            }else {
                mp.put(key, 1);
            }
    }

    public static boolean isAnagramWithOneMap(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        Map<String,Integer> mp1 = countFreqOfWordsInString(s);
        for (int i = 0; i < t.length(); i++) {
            String charAtI = String.valueOf(t.charAt(i)).toLowerCase();
            if(mp1.containsKey(charAtI)){
                mp1.put(charAtI, mp1.get(charAtI) - 1);
            }else {
                return false;
            }
        }

        for (var ele : mp1.keySet()){
            if (mp1.get(ele) != 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){return false;}
        Map<String, Integer> mp1 = new HashMap<>();
        Map<String,Integer> mp2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            addOrUpdateEntry(s.charAt(i), mp1);
            addOrUpdateEntry(t.charAt(i),mp2);
        }
        return mp1.equals(mp2);
    }

    public static boolean isIsomorphicStrings(String  s, String  t){
        if(s.length() != t.length()){return false;}

        Map<String,String> mp1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String charAtIForS = String.valueOf(s.charAt(i));
            String charAtIForT = String.valueOf(t.charAt(i));

            if(mp1.containsKey(charAtIForS)){
                if(!Objects.equals(mp1.get(charAtIForS), charAtIForT)){
                    return false;
                }
            }else {
                if(mp1.containsValue(charAtIForT)){
                    return false;
                }
                mp1.put(charAtIForS,charAtIForT);
            }
        }

        return true;
    }

    public static int[] twoSumForNonSorted(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1};
    }

    private static int searchTargetUsingBinarySearch(int[] arr, int target){
        //{2,4,5,7,9,10,14} target 12
        int result = -1;
        int start = 0;
        int end =arr.length;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }

            if(target < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int[] twoSumForSorted(int[] arr, int target){
        for (int i = 0; i < arr.length - 1; i++) {
            int result = searchTargetUsingBinarySearch(Arrays.copyOfRange(arr, i + 1, arr.length), target - arr[i]);
            if(result != -1){
                return new int[]{i,result + i};
            }
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
//        System.out.println(fetchMostFrequentElementInArray(new int[] {1,3,2,1,4,1}));
//        System.out.println(isAnagram("Silent","listen"));
//        System.out.println(isAnagram("a","ab"));

//        System.out.println(isIsomorphicStrings("badc","baba"));
//        System.out.println(Arrays.toString(twoSumForNonSorted(new int[]{14, 7, 10, 4, 5, 9, 1, 2}, 13)));
        System.out.println(Arrays.toString(twoSumForSorted(new int[]{14, 7, 10, 4, 5, 9, 1, 2}, 13)));

    }
}
