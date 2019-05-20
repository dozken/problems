package leetcode.easy;

import leetcode.TreeNode;

class UnivaluedBinaryTree965 {
    boolean isUnivalTree(TreeNode root) {
//        if (root.left != null) return root.left.val == root.val && isUnivalTree(root.left);
//        else if (root.right != null) return root.right.val == root.val && isUnivalTree(root.right);
//        return true;

        if (root.left == null && root.right == null) return true;
        else if (root.left != null && root.right != null)
            return root.left.val == root.val && root.right.val == root.val && (isUnivalTree(root.left) && isUnivalTree(root.right));
        else if (root.left != null) return root.left.val == root.val && isUnivalTree(root.left);
        else return root.right.val == root.val && isUnivalTree(root.right);
    }


}
