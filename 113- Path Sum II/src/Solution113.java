import java.util.ArrayList;
import java.util.List;

public class Solution113 {


    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 二叉树中 求根结点到叶子节点的所有路径等于给定值的路径
     */

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result=new ArrayList<>();
        if (root==null){
            return result;
        }
        List<Integer> item=new ArrayList<>();
        item.add(root.val);
        ergodic(root,sum-root.val,item,result);
        return result;
    }

    private void ergodic(TreeNode root, int sum, List<Integer> item, List<List<Integer>> result) {
        if (root==null){
            return;
        }
        if (root.left==null&&root.right==null&&sum==0){
            result.add(new ArrayList<>(item));
            return;
        }
        if (root.left!=null){
            item.add(root.left.val);
            ergodic(root.left,sum-root.left.val,item,result);
            item.remove(item.size()-1);
        }

        if (root.right!=null){
            item.add(root.right.val);
            ergodic(root.right,sum-root.right.val,item,result);
            item.remove(item.size()-1);
        }

    }

}
