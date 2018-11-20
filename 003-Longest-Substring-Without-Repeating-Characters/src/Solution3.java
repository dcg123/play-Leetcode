import java.util.HashMap;
import java.util.Map;

public class Solution3 {


    public static void main(String[] args) {

    }

    /**
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * @param s
     * @return
     */

    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();

        if (s==null||s.length()==0){
            return 0;
        }

        int leftBound=0;
        int max=0;
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            leftBound=Math.max(leftBound,(map.containsKey(c)?map.get(c)+1:0));
            max=Math.max(max,i-leftBound+1);
            map.put(c,i);
        }

        return max;
    }
}

