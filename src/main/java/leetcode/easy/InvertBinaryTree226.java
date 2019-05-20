package leetcode.easy;

import leetcode.TreeNode;

public class InvertBinaryTree226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        dfs(root);
        return root;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        dfs(node.left);
        dfs(node.right);


    }
}
