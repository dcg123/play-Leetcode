public class Solution129 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 求二叉树从根结点到叶子节点所有路径数字总和
     *
     * @param args
     */
    public static void main(String[] args) {

    }


    public int sumNumbers(TreeNode root) {
        if (root==null){
            return 0;
        }

        return help(root,0);
    }

    private int help(TreeNode root, int sum) {
        if (root==null){
            return 0;
        }

        if (root.left==null&&root.right==null){
            return sum*10+root.val;
        }

        return help(root.left,(sum*10)+root.val)+help(root.right,sum*10+root.val);
    }


}
