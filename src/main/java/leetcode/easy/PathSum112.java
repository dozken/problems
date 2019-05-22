package leetcode.easy;

import leetcode.TreeNode;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PathSum112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;

        sum -= root.val;
        if ((root.left == null) && (root.right == null))
            return (sum == 0);
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }


    @Test
    public void test() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(0);

        node.right = new TreeNode(3);
        node.right.left = new TreeNode(3);
        node.right.right = new TreeNode(3);

        boolean b = hasPathSum(node, 5);
        assertTrue(b);
    }
}
