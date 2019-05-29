package leetcode.easy;

public class MinCostClimbingStairs746 {

    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }

        int prev2 = cost[0];
        int prev1 = cost[1];

        for (int i = 2; i < cost.length; i++) {
            int curr = cost[i] + Math.min(prev2, prev1);
            prev2 = prev1;
            prev1 = curr;
        }

        return Math.min(prev1, prev2);
    }

    public int minCostClimbingStairsB(int[] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }

        int l = cost.length;

        int[] dp = new int[l];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < l; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 2], dp[i - 1]);
        }

        return Math.min(dp[l - 1], dp[l - 2]);
    }

}
