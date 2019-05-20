package leetcode.easy;

import leetcode.TreeNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DiameterofBinaryTree543 {
    int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return result;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);

        int nodeDiameter = left + right;
        result = Math.max(result, nodeDiameter);

        return Math.max(left, right) + 1;
    }

    @Test
    public void test() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
//        node.left.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right = new TreeNode(3);
        int i = diameterOfBinaryTree(node);
        assertEquals(3, i);

    }

    @Test
    public void test2() {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(1);
//        node.left.left.left = new TreeNode(4);
        node.left.right = new TreeNode(3);
//        node.right = new TreeNode(3);
        int i = diameterOfBinaryTree(node);
        assertEquals(2, i);
    }


}
