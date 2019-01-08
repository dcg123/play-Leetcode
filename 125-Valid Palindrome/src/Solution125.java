public class Solution125 {


    /**
     * 判断是否是回文串
     * <p>
     * Example 1:
     * <p>
     * Input: "A man, a plan, a canal: Panama"
     * Output: true
     * Example 2:
     * <p>
     * Input: "race a car"
     * Output: false
     *
     * @param args
     */

    public static void main(String[] args) {
        //System.out.println();
        System.out.println(new Solution125().isPalindrome("race a car"));
    }

    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char left = s.charAt(start);
            char right = s.charAt(end);

            if (Character.isLetterOrDigit(left) && Character.isLetterOrDigit(right)) {
                if (Character.toUpperCase(left) != Character.toUpperCase(right)) {
                    return false;
                }
                start++;
                end--;
            } else if (!Character.isLetterOrDigit(left)) {
                start++;
            } else if (!Character.isLetterOrDigit(right)) {
                end--;
            }
        }

        return true;
    }

}
