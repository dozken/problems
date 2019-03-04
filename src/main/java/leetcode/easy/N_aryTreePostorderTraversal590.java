package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class N_aryTreePostorderTraversal590 {

    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        return postorder(root, result);
    }

    private List<Integer> postorder(Node root, List<Integer> result) {
        if (root != null) {
            for (Node child : root.children) {
                postorder(child, result);
            }
            result.add(root.val);
        }
        return result;
    }

    public List<Integer> postorderA(Node root) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> s2 = new Stack<>();

        Stack<Node> s1 = new Stack<>();
        s1.add(root);
        while (!s1.empty()) {
            Node node = s1.pop();
            s2.add(node);

            for (Node child : node.children)
                s1.add(child);

        }

        while (!s2.empty())
            result.add(s2.pop().val);

        return result;
    }

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
