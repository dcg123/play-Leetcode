public class Solution27 {


    public static void main(String[] args) {

    }


    /**
     * Given nums = [3,2,2,3], val = 3,
     *
     * Your function should return length = 2, with the first two elements of nums being 2.
     *
     * It doesn't matter what you leave beyond the returned length.
     */


    public int removeElement(int[] nums, int val) {
        int res=0;

        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[res++]=nums[i];
            }
        }
        return res;
    }
}
