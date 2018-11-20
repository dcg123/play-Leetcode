public class Solution48 {


    public static void main(String[] args) {

    }


    /**
     * 一个n x n的二维矩阵表示一个图像，将图像顺时针旋转90度。要求in-place，所以就不能用额外的空间了。
     * 先以对割线交换位置 然后再以中间竖轴翻转
     */

    public void rotate(int[][] matrix) {
        int n=matrix.length;

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }

}
