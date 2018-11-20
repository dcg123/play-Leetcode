import java.util.ArrayList;
import java.util.List;

public class Solution46 {


    /**
     * Input: [1,2,3]
     * Output:
     * [
     *   [1,2,3],
     *   [1,3,2],
     *   [2,1,3],
     *   [2,3,1],
     *   [3,1,2],
     *   [3,2,1]
     * ]
     * @param args
     */
    public static void main(String[] args) {

    }



    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        dfs(result,nums,list,0);
        return result;
    }

    private void dfs(List<List<Integer>> result, int[] nums,List list,int dep) {
        if (dep==nums.length){
            result.add(list);
            return;
        }

        for (int i=dep;i<nums.length;i++){
            swap(nums,dep,i);
            list.add(nums[dep],nums[i]);
            dfs(result,nums,list,dep+1);
            swap(nums,dep,i);
        }
    }

    private void swap(int []nums,int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


}
