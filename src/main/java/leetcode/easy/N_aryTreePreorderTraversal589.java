package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class N_aryTreePreorderTraversal589 {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while (!stack.empty()) {
            root = stack.pop();
            list.add(root.val);
            for (int i = root.children.size() - 1; i >= 0; i--)
                stack.add(root.children.get(i));
        }

        return list;
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


//     public List<Integer> preorder(Node root) {
//         List<Integer> list = new ArrayList<>();
//         return dfs(root, list);
//     }

//     private List<Integer> dfs(Node node, List<Integer> list){
//         if(node != null){
//             list.add(node.val);
//             for(Node child : node.children){
//                 dfs(child, list);
//             }
//         }
//         return list;
//     }
}
