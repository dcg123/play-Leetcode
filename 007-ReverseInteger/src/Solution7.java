public class Solution7 {


    /**
     * Input: 123
     * Output: 321
     * Example 2:
     *
     * Input: -123
     * Output: -321
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Solution7().reverse(-2147483648));
    }

    public int reverse(int x) {
        String str=String.valueOf(x);
        String result="";

        int start=0;
        int end=str.length();
        if (str.charAt(0)=='+'||str.charAt(0)=='-'){
            start=1;
            if (str.charAt(0)=='-'){
                result+='-';
            }
        }

        for (int i=end-1;i>=start;i--){
            result+=str.charAt(i);
        }

        if (Long.parseLong(result)>Integer.MAX_VALUE||
                Long.parseLong(result)<Integer.MIN_VALUE){
                return 0;
        }


        return Integer.valueOf(result);
    }


}
