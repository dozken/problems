package leetcode.easy;

import org.junit.Test;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight1046 {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : stones){
            minHeap.offer(i);
        }

        while(minHeap.size()!=1){
            int y = minHeap.poll();
            int x = minHeap.poll();

            if(y != x){
                minHeap.offer(y-x);
            }
        }

        return minHeap.poll();

    }

    @Test
    public void test(){
//        lastStoneWeight(new int[]{2,7,4,1,8,1});
        lastStoneWeight(new int[]{2,2});
    }
}
