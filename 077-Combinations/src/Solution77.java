import java.util.ArrayList;
import java.util.List;

public class Solution77 {


    public static void main(String[] args) {
        System.out.println(new Solution77().combine(4,2));
    }

    /**
     * 数据组合  从1-n总选出k个数 的所有组合
     * Input: n = 4, k = 2
     * Output:
     * [
     *   [2,4],
     *   [3,4],
     *   [2,3],
     *   [1,2],
     *   [1,3],
     *   [1,4],
     * ]
     */

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backtracking(result,list,1,1,n,k);
        return result;
    }

    private void backtracking(List<List<Integer>> resList, List<Integer> list, int t, int start, int n, int k) {
        if(t>k){
            resList.add(new ArrayList<>(list));
        }else{
            for(int i=start;i<=n;i++){
                list.add(i);
                backtracking(resList, list, t+1,i+1, n, k);
                list.remove(list.size()-1);
            }
        }
    }
}
