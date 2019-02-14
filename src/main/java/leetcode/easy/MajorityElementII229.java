package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII229 {
    // time - O(n)
    // space - O(n)
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();

        double occurence = nums.length / 3.0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (Double.valueOf(entry.getValue()) > occurence) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public List<Integer> majorityElementB(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        int number1 = nums[0];
        int number2 = nums[0];
        int count1 = 0;
        int count2 = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if(false)
                System.out.println();
            else if (count1 == 0) {
                number1 = nums[i];
                count1 = 0;
            }
            else if (count2 == 0) {
                number2 = nums[i];
                count2 = 0;
            }
            else if (number1 == nums[i])
                count1++;
            else if (number2 == nums[i])
                count2++;

            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == number1)
                count1++;
            else if (nums[i] == number2)
                count2++;
        }
        if (count1 > len / 3)
            result.add(number1);
        if (count2 > len / 3)
            result.add(number2);
        return result;
    }
}
