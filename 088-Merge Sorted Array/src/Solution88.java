public class Solution88 {

    public static void main(String[] args) {

    }

    /**
     * 合并有序数组
     *Input:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     *
     * Output: [1,2,2,3,5,6]
     */


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n<=0&&m<=0){
            return;
        }
        int start1=0;
        int start2=0;
        int result[]=new int[m+n];

        for (int i=0;i<m+n;i++){
            if (start1<m&&start2<n){
                if (nums1[start1]<nums2[start2]){
                    result[i]=nums1[start1];
                    start1++;
                }else {
                    result[i]=nums2[start2];
                    start2++;
                }
            }
            else if (start1<m&&start2>=n){
                result[i]=nums1[start1];
                start1++;
            }
            else if (start1>=m&&start2<n){
                result[i]=nums2[start2];
                start2++;
            }else {
                return;
            }
        }
        for (int i=0;i<m+n;i++){
            nums1[i]=result[i];
        }
    }
}
