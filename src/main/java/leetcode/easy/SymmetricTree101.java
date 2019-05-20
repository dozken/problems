package leetcode.easy;

import leetcode.TreeNode;
import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

import static junit.framework.TestCase.assertTrue;

public class SymmetricTree101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean result = true;

        Deque<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root);
        deque.addLast(root);

        while (!deque.isEmpty()) {
            TreeNode n1 = deque.pollFirst();
            TreeNode n2 = deque.pollLast();
            if (n1 == null && n2 == null) {
                continue;
            } else if (n1 == null || n2 == null) {
                return false;
            } else if (n1.val != n2.val) {
                return false;
            }

            deque.addFirst(n1.left);
            deque.addLast(n2.right);
            deque.addFirst(n2.left);
            deque.addLast(n1.right);

        }


        return result;
    }

    public boolean isSymmetricR(TreeNode root) {
        return isSame(root, root);
    }

    public boolean isSame(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) return true;
        else if (n1 == null || n2 == null) return false;

        return n1.val == n2.val
                &&
                isSame(n1.left, n2.right)
                &&
                isSame(n2.right, n1.left);
    }

    @Test
    public void test() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(3);
        boolean symmetric = isSymmetric(node);
        assertTrue(symmetric);
    }
}
