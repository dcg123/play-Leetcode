public class Solution59 {


    /**
     * 螺旋打印
     *
     * Input: 3
     * Output:
     * [
     *  [ 1, 2, 3 ],
     *  [ 8, 9, 4 ],
     *  [ 7, 6, 5 ]
     * ]
     */


    public static void main(String[] args) {
        System.out.println(new Solution59().generateMatrix(3));
    }


    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
//        int rowNum=n;
//        int colNum=n;
//        int left=0,top=0,right=colNum-1,bot=rowNum-1;
//
//        int sum=1;
//        while (sum<=n*n){
//            for (int col=left;col<=right;col++){
//                result[top][col]=sum;
//                sum++;
//            }
//            top++;
//
//            if (sum<=n*n){
//                for (int row=top;row<=bot;row++){
//                    result[row][right]=sum;
//                    sum++;
//                }
//                right--;
//            }
//
//            if (sum<=n*n){
//                for (int col=right;col>=left;col--){
//                    result[bot][col]=sum;
//                    sum++;
//                }
//                bot--;
//            }
//
//            if (sum<=n*n){
//                for (int row=bot;row>=top;row--){
//                    result[left][row]=sum;
//                    sum++;
//                }
//                left++;
//            }
//        }
        return  result;
    }




}
