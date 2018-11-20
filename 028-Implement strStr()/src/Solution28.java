public class Solution28 {


    /**
     * kmp
     *
     * Input: haystack = "hello", needle = "ll"
     * Output: 2
     * 在匹配模式串中hello 找出呆匹配的字符串ll第一次出现的位置
     */


    static int MAX_N=10000+10;
    static int next[]=new int[1000000+10];
    static int a,b;
    public static void main(String args[]){
        System.out.println(new Solution28().strStr("hello","ll"));
    }

    public int strStr(String haystack, String needle) {
        b=needle.length();
        a=haystack.length();
        getNext(needle.toCharArray());
        kmp(haystack.toCharArray(),needle.toCharArray());
        return 0;
    }
    private static void kmp( char T[], char P[]) {
        int i = 0, j = 0;
        while (i < a&&j<b) {
            if (j == -1 || T[i] == P[j]) {
                i++;
                j++;
            } else{
                j = next[j];
            }

        }
        if(j<b)
            System.out.println("-1");
        else
            System.out.println(i-b+1);
    }
    private static void getNext( char P[]) {
        int i = 0, j = -1;
        next[0] = -1;
        while (i < b) {
            if (j == -1 || P[i] == P[j]) {
                i++;
                j++;
                next[i] = j;
            } else
                j = next[j];
        }
    }
}
