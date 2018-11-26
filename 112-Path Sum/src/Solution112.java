import java.util.Stack;

public class Solution112 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }

    /**
     *给定一个二叉树 求到叶子结点的路径和是否等于给定的数
     *
     *
     * Example:
     *
     * Given the below binary tree and sum = 22,
     *
     *       5
     *      / \
     *     4   8
     *    /   / \
     *   11  13  4
     *  /  \      \
     * 7    2      1
     */

    boolean res=false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null){
            return false;
        }
        int count=0;
        isHasPathSum(root, sum, count);
        return res;
    }

    private void isHasPathSum(TreeNode root, int sum, int count) {
        count+=root.val;
        if (root.left==null&&root.right==null){
            if (count==sum){
                res=true;
                return;
            }
            count=0;
        }
        if (root.left!=null){
            isHasPathSum(root.left,sum,count);
        }

        if (root.right!=null){
            isHasPathSum(root.right,sum,count);
        }
    }

}
