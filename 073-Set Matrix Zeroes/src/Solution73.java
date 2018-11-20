public class Solution73 {

    /**
     * 将矩阵中有0的位置的行和列都置为0
     *
     * 不能使用额外空间
     */


    public static void main(String[] args) {

    }

    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        if (n==0||m==0){
            return;
        }

        //判断第一行是否有0
        boolean row=false;
        boolean col=false;
        for (int i=0;i<m;i++){
            if (matrix[0][i]==0){
                row=true;
            }
        }

        for (int i=0;i<n;i++){
            if (matrix[i][0]==0){
                row=true;
            }
        }

        //寻找除了第一行和第一例 0以外的位置
        for (int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }

            }
        }

        //根据位置吧行列置为0
        for (int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                if (matrix[i][0]==0||matrix[j][0]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if (row){
            for (int i=0;i<m;i++){
                matrix[0][i]=0;
            }
        }
        if (col){
            for (int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }

    }


}
