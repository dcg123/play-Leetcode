import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;
import java.util.List;

public class Solution94 {


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

    List<Integer> result = new ArrayList<>();


    /**
     * 给定一个二叉树 输出中序遍历
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }

        if (root.left != null) {
            inorderTraversal(root.left);
        }
        result.add(root.val);

        if (root.right != null) {
            inorderTraversal(root.right);
        }
        return result;

    }

    /**
     * 给定一个二叉树 输出前序遍历
     *
     */

    public List<Integer> qianTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }
        result.add(root.val);


        if (root.left != null) {
            qianTraversal(root.left);
        }

        if (root.right != null) {
            qianTraversal(root.right);
        }
        return result;

    }
    /**
     * 后续遍历
     */

    public List<Integer> houTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }


        if (root.left != null) {
            houTraversal(root.left);
        }

        if (root.right != null) {
            houTraversal(root.right);
        }
        result.add(root.val);

        return result;

    }
}
