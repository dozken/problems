package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

    // time - O(n)
    // space - O(n)
    public int majorityElement(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("nums must not be null");
        }

        if (nums.length == 0) {
            throw new IllegalArgumentException("nums must not be empty");
        }

        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > length / 2) {
                return num;
            }
        }
        return 0;
    }

    // Boyer-Moore Voting Algorithm
    // time - O(n)
    // space - O(1)
    public int majorityElementB(int[] nums) {
        int count = 0;
        int candidate =0;
        for(int num : nums){
            if(count == 0)
                candidate = num;
            if(candidate == num)
                count ++;
            else
                count --;
        }
        return candidate;
    }
}
