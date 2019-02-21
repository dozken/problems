package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m1 = new HashMap<>();
        for (int n : nums1) {
            m1.put(n, 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int n : nums2) {
            if (m1.containsKey(n) && m1.get(n) != 0) {
                m1.put(n, 0);
                list.add(n);

            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
        // return list.stream().mapToInt(i->i).toArray();
    }
}
