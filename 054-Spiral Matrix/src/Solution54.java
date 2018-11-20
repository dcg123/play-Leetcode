import java.util.ArrayList;
import java.util.List;

public class Solution54 {


    /**
     * 螺旋打印矩形
     * Input:
     * [
     [ 1, 2, 3 ],
     [ 8, 9, 4 ],
     [ 7, 6, 5 ]
     * ]
     * Output: [1,2,3,6,9,8,7,4,5]
     */


    public static void main(String[] args) {
//        System.out.println(new Solution54().spiralOrder(new int[][]
//                { {1, 2, 3 },{ 4, 5, 6 },{7, 8, 9 }} ));
        System.out.println(new Solution54().generateMatrix(3));
    }


    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();

        if (matrix==null||matrix.length==0){
            return result;
        }

        int rowNum=matrix.length;
        int colNum=matrix[0].length;

        int left=0,right=colNum-1,top=0,bot=rowNum-1;

        while (result.size()<rowNum*colNum){
            for (int col=left;col<=right;col++){
                result.add(matrix[top][col]);
            }
            top++;

            if (result.size()<rowNum*colNum){
                for (int row=top;row<=bot;row++){
                    result.add(matrix[row][right]);
                }
                right--;
            }

            if (result.size()<rowNum*colNum){
                for (int col=right;col>=left;col--){
                    result.add(matrix[bot][col]);
                }
                bot--;
            }

            if (result.size()<rowNum*colNum){
                for (int row=bot;row>=top;row--){
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }

        return result;
    }

    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        int rowNum=n;
        int colNum=n;
        int left=0,top=0,right=colNum-1,bot=rowNum-1;

        int sum=1;
        while (sum<=n*n){
            for (int col=left;col<=right;col++){
                result[top][col]=sum;
                sum++;
            }
            top++;

            if (sum<=n*n){
                for (int row=top;row<=bot;row++){
                    result[row][right]=sum;
                    sum++;
                }
                right--;
            }

            if (sum<=n*n){
                for (int col=right;col>=left;col--){
                    result[bot][col]=sum;
                    sum++;
                }
                bot--;
            }

            if (sum<=n*n){
                for (int row=bot;row>=top;row--){
                    result[row][left]=sum;
                    sum++;
                }
                left++;
            }
        }
        return  result;
    }
}
