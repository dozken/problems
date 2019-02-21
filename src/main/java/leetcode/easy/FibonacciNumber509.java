package leetcode.easy;

public class FibonacciNumber509 {

    int fib(int N) {
        if (N < 2)
            return N;

        int a = 0;
        int b = 1;
        int result = 0;
        for (int i = 2; i <= N; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }

    public int fibB(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fib(N - 1) + fib(N - 2);
    }

}
