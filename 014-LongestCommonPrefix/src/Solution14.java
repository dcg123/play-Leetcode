public class Solution14 {


    public static void main(String[] args) {
        System.out.println(new Solution14().longestCommonPrefix(new String[]{"c","c"}));
    }


    public String longestCommonPrefix(String[] strs) {
        String res="";
        if (strs.length==0||strs==null){
            return  res;
        }

        for (int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);

            for (int j=0;j<strs.length;j++){
                if (i>=strs[j].length()||strs[j].charAt(i)!=c){
                    return res;
                }
            }
            res+=c;
        }
        return res;
    }
}
