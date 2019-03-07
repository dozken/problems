package leetcode.medium;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal144 {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {

        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if (root == null) return list;

            Stack<TreeNode> stack = new Stack<>();
            stack.add(root);

            while (!stack.empty()) {
                TreeNode node = stack.pop();
                list.add(node.val);
                if (node.right != null) {
                    stack.add(node.right);
                }
                if (node.left != null) {
                    stack.add(node.left);
                }
            }

            return list;
        }


        public List<Integer> preorderTraversalRecursive(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            return dfs(root, list);
        }

        private List<Integer> dfs(TreeNode root, List<Integer> list) {
            if (root != null) {
                list.add(root.val);

                dfs(root.left, list);
                dfs(root.right, list);
            }
            return list;
        }

    }
}
