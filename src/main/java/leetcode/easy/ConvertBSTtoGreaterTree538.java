package leetcode.easy;

import leetcode.TreeNode;

public class ConvertBSTtoGreaterTree538 {

    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return root;
        }
        convertBST(root.right);
        sum += root.val;
        root.val = sum;
        convertBST(root.left);

        return root;
    }

}
