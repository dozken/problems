package leetcode.easy;

public class DesignLinkedList707 {
    public static class MyLinkedList {
        private int val;
        private MyLinkedList next;

        private MyLinkedList head;

        /** Initialize your data structure here. */
        public MyLinkedList() {
            head = this;
            next = null;
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            int count = 0;
            MyLinkedList cursor = head;
            while(cursor!=null){
                if(count==index){
                    return cursor.val;
                }
                cursor = cursor.next;
                count++;
            }
            return -1;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            head.val = val;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            head.next = new MyLinkedList();
            head.next.val = val;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            int count = 0;
            MyLinkedList cursor = head;
            MyLinkedList prev = cursor;
            while(cursor!=null){
                if(count==index){
                    MyLinkedList temp = cursor;
                    cursor.next = temp;
                    cursor.val = val;
                    return;
                }
                prev = cursor;
                cursor = cursor.next;
                count++;
            }

            if(count==index){
                prev.next = new MyLinkedList();
                prev.next.val = val;
            }


        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            int count = 0;
            MyLinkedList cursor = head;
            MyLinkedList prev = cursor;
            while(cursor!=null){
                if(count==index){
                    prev.next = cursor.next;
                    // cursor = cursor.next;
                    cursor = null;
                    return;
                }
                prev = cursor;
                cursor = cursor.next;
                count++;
            }
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
