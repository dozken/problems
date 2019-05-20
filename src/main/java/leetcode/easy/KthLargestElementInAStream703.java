package leetcode.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import static junit.framework.TestCase.assertEquals;

public class KthLargestElementInAStream703 {

    @Test
    public void test() {
        int k = 3;
        int[] arr = new int[]{4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(k, arr);

        assertEquals(4, kthLargest.add(3));// returns 4
        assertEquals(5, kthLargest.add(5));   // returns 5
        assertEquals(5, kthLargest.add(10));  // returns 5
        assertEquals(8, kthLargest.add(9));   // returns 8
        assertEquals(8, kthLargest.add(4));   // returns 8
    }

    class KthLargest {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            for (int num : nums)
                pq.add(num);

        }

        public int add(int val) {
            pq.add(val);
            int size = pq.size();
            int k = size - this.k;

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i != k; i++) {
                Integer poll = pq.poll();
                list.add(poll);
            }

            int result = pq.peek();
            list.forEach(x -> pq.add(x));
            return result;
        }
    }
}
