import java.util.Stack;

public class Solution20 {


    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * @param args
     *
     * Input: "()"
     * Output: true
     * Example 2:
     *
     * Input: "()[]{}"
     * Output: true
     */
    public static void main(String[] args) {

    }



    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        if (s==null||s.length()==0){
            return true;
        }

        char str[]=s.toCharArray();
        for (char c:str){



            if (c=='{'||c=='['||c=='('){
                stack.push(c);
            }else{

                if (stack.empty()){
                    return false;
                }

                if (c=='}'&&stack.pop()!='{'){
                    return false;
                }

                if (c==']'&&stack.pop()!='['){
                    return false;
                }

                if (c==')'&&stack.pop()!='('){
                    return false;
                }
            }


        }

        return stack.empty();
    }
}
