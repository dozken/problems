package leetcode.easy;

import leetcode.TreeNode;

public class MaximumDepthofBinaryTree104 {

    public int maxDepth(TreeNode root) {
        return dfs(root);
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int lMax = dfs(node.left);
        int rMax = dfs(node.right);

        return Math.max(lMax, rMax) + 1;

    }
}
