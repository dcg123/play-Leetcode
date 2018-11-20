import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution15 {


    public static void main(String[] args) {
        System.out.println(new Solution15().threeSum(new int[]{0,0,0,0}));
    }


    List<List<Integer>> ret = new ArrayList<List<Integer>>();

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return ret;
        Arrays.sort(nums);
        int len = nums.length;for (int i = 0; i < len-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            find(nums, i+1, len-1, nums[i]); //寻找两个数与num[i]的和为0  
        }
        return ret;
    }

    private void find(int[] num, int begin, int end, int target) {
        int l = begin, r = end;
        while (l < r) {
            if (num[l] + num[r] + target == 0) {
                List<Integer> ans = new ArrayList<Integer>();
                ans.add(target);
                ans.add(num[l]);
                ans.add(num[r]);
                ret.add(ans); //放入结果集中  
                while (l < r && num[l] == num[l+1]) l++;
                while (l < r && num[r] == num[r-1]) r--;
                l++;
                r--;
            } else if (num[l] + num[r] + target < 0) {
                l++;
            } else {
                r--;
         }
       }
    }


//    private boolean isExit(List<Integer> temp, List<List<Integer>> result) {
//        for (int i=0;i<result.size();i++){
//            List<Integer> index=result.get(i);
//            int count=0;
//            for (int j=0;j<temp.size();j++){
//                if (index.contains(temp.get(j))){
//                    count++;
//                }
//            }
//            if (count==temp.size()){
//                return true;
//            }
//        }
//
//        return  false;
//    }
}
