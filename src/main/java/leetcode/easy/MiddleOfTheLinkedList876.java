package leetcode.easy;

class MiddleOfTheLinkedList876 {

    public ListNode middleNode(ListNode head) {
        int i = 0;
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
            i++;
        }

        node = head;
        i = i % 2 + i / 2;
        for (int j = 0; j < i; j++) {
            node = node.next;
        }
        return node;
    }

}
