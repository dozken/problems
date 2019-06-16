package leetcode.medium;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author dozken
 * On 16-Jun-19.
 */
public class KClosestPointstoOrigin973 {
    class Distance {
        private double distance;
        private int[] point;

        public Distance(double distance, int[] point) {
            this.distance = distance;
            this.point = point;
        }

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }

        public int[] getPoint() {
            return point;
        }

        public void setPoint(int[] point) {
            this.point = point;
        }
    }

    public int[][] kClosest(int[][] points, int K) {
        if (points.length < K) {
            throw new IllegalArgumentException("illegal points");
        }

        PriorityQueue<Distance> min = new PriorityQueue<>(getDistanceComparator());

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];

            double distance = Math.sqrt(x * x + y * y);
            min.offer(new Distance(distance, points[i]));
        }

        int[][] result = new int[K][2];
        for (int i = 0; i < K; i++) {
            result[i] = min.poll().getPoint();
        }
        return result;

    }

    private Comparator<Distance> getDistanceComparator() {
        return Comparator.comparingDouble(Distance::getDistance);
    }
}
