package leetcode.easy;

import leetcode.TreeNode;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;

public class CousinsInBinaryTree993 {

    Map<Integer, Integer> depth;
    Map<Integer, TreeNode> parent;

    public boolean isCousins(TreeNode root, int x, int y) {
        depth = new HashMap<>();
        parent = new HashMap<>();
        dfs(null, root, x, y, 0);

        return
                depth.get(x) == depth.get(y)
                        && parent.get(x).val != parent.get(y).val;
    }

    public void dfs(TreeNode root, TreeNode node, int x, int y, int level) {
        if (node != null) {
            if (node.val == x) {
                depth.put(x, level);
                parent.put(x, root);
            } else if (node.val == y) {
                depth.put(y, level);
                parent.put(y, root);
            }

            dfs(node, node.left, x, y, level + 1);
            dfs(node, node.right, x, y, level + 1);
        }
    }


    @Test
    public void test() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.right = new TreeNode(3);

        assertFalse(isCousins(node, 3, 4));
    }


}
