package leetcode.easy;

import org.junit.Test;

public class MinStack155 {

    @Test
    public void test() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.getMin();

    }

    class MinStack {

        class Node {
            Node prev;
            Node next;
            int min;
            int val;
        }

        Node node;

        public MinStack() {
        }

        public void push(int val) {
            node = new Node();
            node.val = val;
            node.min = node.prev == null ? val : Math.min(node.prev.min, node.min);

            node.prev = node;
            node = node.next;
        }

        public void pop() {
            node = node.prev;
        }

        public int top() {
            return node.val;
        }

        public int getMin() {
            return node.min;
        }
    }

    class MinStack1 {

        private int min;
        private Node head;
        private Node tail;

        /**
         * initialize your data structure here.
         */
        public MinStack1() {
            min = Integer.MIN_VALUE;
        }

        public void push(int x) {
            if (head == null) {
                head = new Node(x);
                tail = head;
            } else {
                while (tail != null) {
                    tail = tail.next;
                }
                tail = new Node(x);
            }
        }

        public void pop() {
            if (head != null) {
                head = head.next;
            }
        }

        public int top() {
            if (head == null) {
                throw new RuntimeException("head is null");
            }

            return head.val;
        }

        public int getMin() {
            Node node = head;

            while (node != null) {
                min = Math.min(min, node.val);
                node = node.next;
            }
            return min;
        }

        class Node {
            private Node next;
            private int val;

            public Node(int val) {
                this.val = val;
            }

            public Node() {
            }
        }
    }
}
