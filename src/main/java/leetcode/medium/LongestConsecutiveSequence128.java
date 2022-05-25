package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence128 {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int result = 0;

        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }



        for(int num: nums){
            if(!set.contains(num-1)){
                int length = 0;
                int left = num;
                while(set.contains(--left)){
                    length++;
                    set.remove(left);
                }

                int right = num;
                while(set.contains(++right)){
                    length++;
                    set.remove(right);
                }
                result = Math.max(length, result);
            }
        }

        return result;
    }
}
