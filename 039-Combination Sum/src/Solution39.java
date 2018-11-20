import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution39 {


    /**
     * 组合的和
     */


    public static void main(String[] args) {
        System.out.println(new Solution39().combinationSum(new int[]{2,3,5},8));
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result,list,candidates,target,0);
        return result;
    }

    private boolean backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int statrt) {
        if (remain<0){
            return false;
        }else if (remain==0){
            result.add(new ArrayList<>(tempList));
            return false;
        }else{
            boolean flag;
            for (int i=statrt;i<candidates.length;i++){
                tempList.add(candidates[i]);
                flag=backtrack(result,tempList,candidates,remain-candidates[i],i);
                tempList.remove(tempList.size()-1);
                if (!flag){
                    break;
                }
            }
            return true;
        }
    }
}
