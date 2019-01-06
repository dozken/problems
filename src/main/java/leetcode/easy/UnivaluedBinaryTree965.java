package leetcode.easy;

public class UnivaluedBinaryTree965 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isUnivalTree(TreeNode root) {
//        if (root.left != null) return root.left.val == root.val && isUnivalTree(root.left);
//        else if (root.right != null) return root.right.val == root.val && isUnivalTree(root.right);
//        return true;

        if (root.left == null && root.right == null) return true;
        else if (root.left != null && root.right != null)
            return root.left.val == root.val && root.right.val == root.val && (isUnivalTree(root.left) && isUnivalTree(root.right));
        else if (root.left != null) return root.left.val == root.val && isUnivalTree(root.left);
        else if (root.right != null) return root.right.val == root.val && isUnivalTree(root.right);

        return false;
    }


}
