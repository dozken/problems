package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal102 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();

            return levelOrder(root, 0, result);
        }

        private List<List<Integer>> levelOrder(TreeNode root, int depth, List<List<Integer>> result) {
            if (root == null)
                return result;

            List<Integer> level;
            if (result.size() > depth) {
                level = result.get(depth);
            } else {
                level = new ArrayList<>();
                result.add(level);
            }
            level.add(root.val);

            if (root.left != null)
                levelOrder(root.left, depth + 1, result);
            if (root.right != null)
                levelOrder(root.right, depth + 1, result);

            return result;
        }
    }

}
