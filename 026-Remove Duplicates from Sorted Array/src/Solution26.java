import java.util.ArrayList;
import java.util.List;

public class Solution26 {


    public static void main(String[] args) {


        System.out.println(new Solution26().removeDuplicates(new int[]{1,1,2}));
    }


    /**
     * Given nums = [1,1,2],
     *
     * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
     *
     * It doesn't matter what you leave beyond the returned length.
     */


    public int removeDuplicates(int[] nums) {
        if (nums==null||nums.length==1){
            return nums.length;
        }


        int j = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] != nums[j]) nums[++j] = nums[i];
        }

        return j+1;

    }
}
