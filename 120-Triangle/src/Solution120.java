import java.util.List;

public class Solution120 {


    /**
     * For example, given the following triangle
     *
     * [
     *      [2],
     *     [3,4],
     *    [6,5,7],
     *   [4,1,8,3]
     * ]
     * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
     */


    public static void main(String[] args) {

    }


    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0) return 0;
        int triszie = triangle.size();
        int[] dp = new int[triszie];

        for(int i = triszie - 1; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                if(i == triszie - 1) dp[j] = triangle.get(i).get(j);
                else dp[j] = Math.min(dp[j],dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
