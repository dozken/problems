package leetcode.easy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageFromDataStream346 {

    class MovingAverage {

        Queue<Integer> queue = new LinkedList<>();
        int size;
        double sum;

        public MovingAverage(int size) {
            this.size = size;
            this.sum = 0;
        }

        public double next(int val) {
            if (queue.size() == size) {
                sum -= queue.poll();
            }

            queue.offer(val);
            sum += val;

            return sum / queue.size();
        }

    }


    class MovingAverage2 {

        Queue<Integer> q = new LinkedList<>();
        int size;

        /**
         * Initialize your data structure here.
         */
        public MovingAverage2(int size) {
            this.size = size;
        }

        public double next(int val) {
            if (q.size() == size) {
                q.poll();
            }
            q.offer(val);
            return avg(q, q.size());
        }

        private double avg(Queue<Integer> queue, int size) {
            Iterator value = queue.iterator();
            int result = 0;

            while (value.hasNext()) {
                result += (int) value.next();
            }

            return (double) result / size;
        }
    }

}
