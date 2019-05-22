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

        private int min;
        private Node head;
        private Node tail;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
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
