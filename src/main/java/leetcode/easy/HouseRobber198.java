package leetcode.easy;

public class HouseRobber198 {

    public int rob(int[] nums) {

        int prev2 = 0;
        int prev1 = 0;

        for (int num : nums) {
            int currentMax = prev1;
            prev1 = Math.max(num + prev2, prev1);
            prev2 = currentMax;
        }

        return prev1;
    }

    public int robB(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }
}
