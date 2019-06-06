package leetcode.easy;

public class FibonacciNumber509 {

    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
    //Memory Usage: 35.1 MB, less than 98.82% of Java online submissions for Fibonacci Number.
    // time O(n)
    // space O(1)
    public int fib(int N) {
        if (N < 2)
            return N;

        int a = 0;
        int b = 1;
        int r = 0;
        for (int i = 2; i <= N; i++) {
            r = a + b;
            a = b;
            b = r;
        }

        return r;
    }

    public int fibB(int N) {
        if (N < 2) return N;

        int[] dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[N];

    }

    public int fibC(int N) {
        if (N < 2) return N;
        return fib(N - 1) + fib(N - 2);
    }

}
