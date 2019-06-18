package leetcode.medium;

import leetcode.easy.ListNode;

public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode(-1);
        ListNode head = curr;
        int carry = 0;
        while(l1 != null || l2 != null){
            int a = 0;
            if(l1 != null){
                a = l1.val;
                l1 = l1.next;
            }

            int b = 0;
            if(l2 != null){
                b = l2.val;
                l2 = l2.next;
            }

            int sum = a + b + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }

        return head.next;
    }

}
