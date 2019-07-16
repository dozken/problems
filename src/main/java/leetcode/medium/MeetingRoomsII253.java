package leetcode.medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeetingRoomsII253 {

    public int minMeetingRooms(int[][] intervals) {
        if(intervals == null){
            return 0;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        minHeap.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int[] interval = minHeap.remove();
            if(intervals[i][0] >= interval[1]){
                interval[1] = intervals[i][1];
            }else{
                minHeap.add(intervals[i]);
            }
            minHeap.add(interval);

        }

        return minHeap.size();
    }

    @Test
    public void test(){
        int actual = minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}});
        assertEquals(2 , actual);
    }

    public int minMeetingRoomsB(int[][] intervals) {
        if (intervals == null || intervals.length == 0)
            return 0;

        // Sort the intervals by start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // Use a min heap to track the minimum end time of merged intervals
        PriorityQueue<int[]> heap = new PriorityQueue<>(intervals.length, Comparator.comparingInt(a -> a[1]));

        // start with the first meeting, put it to a meeting room
        heap.offer(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            // get the meeting room that finishes earliest
            int[] interval = heap.poll();

            if (intervals[i][0] >= interval[1]) {
                // if the current meeting starts right after
                // there's no need for a new room, merge the interval
                interval[1] = intervals[i][1];
            } else {
                // otherwise, this meeting needs a new room
                heap.offer(intervals[i]);
            }

            // don't forget to put the meeting room back
            heap.offer(interval);
        }

        return heap.size();
    }
}
