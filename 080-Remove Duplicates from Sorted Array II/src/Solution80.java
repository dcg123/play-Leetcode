public class Solution80 {


    public static void main(String[] args) {

    }

    /**
     * 删除有序数组zho中重复出现的数 不用额外内存 并且最多保留两个相同的数
     *
     *Given nums = [1,1,1,2,2,3],
     *
     * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
    */


    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        if (len<3){
            return len;
        }
        int pos=2;
        for (int i=2;i<len;i++){
            if (nums[i]!=nums[pos-2]){
                nums[pos++]=nums[i];
            }
        }
        return pos;
    }

}
