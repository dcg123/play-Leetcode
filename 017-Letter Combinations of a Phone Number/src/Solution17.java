import java.util.ArrayList;
import java.util.List;

public class Solution17 {


    /**
     *
     * 回溯 穷举
     *
     * 随机组合  每个数字对应电话上数字对应的三个字符 根据组合输出所有字母组合
     * Input: "23"
     * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Solution17().letterCombinations("23"));
    }


    public List<String> letterCombinations(String digits) {
        String[] table = new String[]
                {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        List<String> list=new ArrayList<>();
        //穷举

        dfs(list,digits,0,"",table);

        return list;

    }

    private void dfs(List<String> list, String digits, int index, String curr, String[] table) {
        if (index==digits.length()){
            if (curr.length()!=0){
                list.add(curr);
            }
            return;
        }

        //取出当前数字对应的串
        String temp=table[digits.charAt(index)-'0'];
        for (int i=0;i<temp.length();i++){
            String next=curr+temp.charAt(i);
            dfs(list,digits,index+1,next,table);
        }
    }
}
