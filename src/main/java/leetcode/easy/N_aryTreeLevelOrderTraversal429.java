package leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N_aryTreeLevelOrderTraversal429 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        return levelOrder(root, 0, result);
    }

    private List<List<Integer>> levelOrder(Node node, int depth, List<List<Integer>> result) {
        if (node != null) {
            List<Integer> level;
            if (result.size() > depth) {
                level = result.get(depth);
            } else {
                level = new ArrayList<>();
                result.add(level);
            }
            level.add(node.val);

            for (Node child : node.children) {
                levelOrder(child, depth + 1, result);
            }
        }

        return result;
    }

    public List<List<Integer>> levelOrderIterative(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            while (size > 0) {
                Node node = q.poll();
                level.add(node.val);
                for (int i = 0; i < node.children.size(); i++) {
                    Node child = node.children.get(i);
                    q.add(child);
                }
                size--;
            }
            result.add(level);
        }
        return result;
    }

    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
