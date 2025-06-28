import java.util.Arrays;
import java.util.List;

public class JunitBasics {

    public static int calculateSum(int[] nums){
        int sum = 0;
        for (int num:nums){
            sum+=num;
        }
        return sum;
    }

    ;

    public static void main(String[] args) {
        System.out.println(calculateSum(new int[]{1,2,3}));
    }
}
