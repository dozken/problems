package leetcode.medium;

import java.util.Arrays;

public class KthLargestElementinanArray215 {

    public int findKthLargest(int[] nums, int k) {
        return findKthLargestB(nums, k);
    }

    // O(nlogn)
    public int findKthLargestB(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
