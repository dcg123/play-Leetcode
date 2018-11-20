import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution40 {


    public static void main(String[] args) {
        System.out.println(new Solution40().combinationSum2(new int[]{10,1,2,7,6,1,5},8));
    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> list=new ArrayList<>();
        dfs(result,list,candidates,target,0);
        return result;
    }

    private boolean dfs(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain<0){
            return false;
        }else if (remain==0){
            result.add(new ArrayList<>(tempList));
            return false;
        }else{
            boolean falg;
            for (int i=start;i<candidates.length;i++){
                if (i > start && candidates[i] == candidates[i - 1]) continue;
                tempList.add(candidates[i]);
                falg=dfs(result,tempList,candidates,remain-candidates[i],i+1);
                tempList.remove(tempList.size()-1);
                if (!falg){
                    break;
                }
            }
            return true;
        }
    }
}
