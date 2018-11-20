import java.util.HashMap;
import java.util.Map;

public class Solution11 {





    public static void main(String[] args) {
        System.out.println(new Solution11().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }


    public int maxArea(int[] height) {
        int max=0;
        int start=0;
        int end=height.length-1;


        while (start<end){
            max=Math.max(max,Math.min(height[start],height[end])*(end-start));
            if (height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }

        return max;
    }

}
