import java.util.HashSet;
import java.util.Set;

public class Solution136 {


    /**
     * 给定一个非空数组 找出数组中只出现一次的数字
     * @param args
     */
    public static void main(String[] args) {

    }




    public int singleNumber(int[] nums) {
        Set<Integer> result=new HashSet<>();

        for (int temp:nums){
            if (!result.contains(temp)){
                result.add(temp);
            }else{
                result.remove(temp);
            }
        }

        int count=0;

        for (Integer temp: result){
            count+=temp;
        }
        return count;
    }
}
