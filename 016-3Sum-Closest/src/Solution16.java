import java.util.Arrays;

public class Solution16 {


    /**
     * Given array nums = [-1, 2, 1, -4], and target = 1.
     *
     * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(new Solution16().threeSumClosest(new int[]{1, 1, -1, -1,3},-1));
    }


    public int threeSumClosest(int[] nums, int target) {
        int close=nums[0]+nums[1]+nums[2];
        int diff=Math.abs(target-close);
        Arrays.sort(nums);

        for (int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                int newDiff=Math.abs(target-sum);
                if (newDiff<diff){
                    diff=newDiff;
                    close=sum;
                }
                if (sum<target){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return close;
    }
}
