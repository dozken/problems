package leetcode.easy;

class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head = prev;
        return head;
    }

    public ListNode reverseListB(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    private ListNode reverseListC(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseListC(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
