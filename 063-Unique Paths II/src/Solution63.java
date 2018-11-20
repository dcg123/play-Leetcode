public class Solution63 {


    public static void main(String[] args) {

    }

    /**
     * 在图形中 从左上角走到右下角(只能向右或者向下走 一共右多少中走法)
     */

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;

        if (m==0||n==0){
            return 0;
        }

        if (obstacleGrid[0][0]==1||obstacleGrid[m-1][n-1]==1){
            return 0;
        }

        int [][]dp=new int[m][n];

        dp[0][0]=1;
        for (int i=1;i<m;i++){
            if (obstacleGrid[i][0]==1){
                dp[i][0]=1;
            }else{
                dp[i][0]=dp[i-1][0];
            }
        }

        for (int i=1;i<n;i++){
            if (obstacleGrid[0][i]==1){
                dp[0][i]=0;
            }else{
                dp[0][i]=dp[0][i-1];
            }
        }

        for (int i=1;i<m;i++){
            for (int j=1;j<m;j++){
                if (obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }

        return dp[m-1][n-1];



    }
}
