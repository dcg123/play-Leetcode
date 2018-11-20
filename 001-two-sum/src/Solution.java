import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {


    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(twoSum(nums,target)[0]);
    }

    /**
     * 大概思路
     * 可以先把值保存起来 然后遍历数组 通过目标数减去当前遍历的数后去查看保存的数是否有这个数
     * container={[num[i],i]} temp=target-num[i];
     * temp->container ?
     * @param nums
     * @param target
     * @return
     */
    public static  int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for (int i=0;i<nums.length;i++){
            Integer index=map.get(target-nums[i]);
            if (index!=null&&index!=i){
                int res[]={i,index};
                return res;
            }
        }
        return null;
    }
}
