package leetcode.easy;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations1005 {

    public int largestSumAfterKNegations(int[] A, int K) {
        if (A == null || A.length == 0) {
            return 0;
        }

        Arrays.sort(A);
        

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0 && K > 0) {
                A[i] *= -1;
            } else if (K > 0) {
                Arrays.sort(A);
                A[0] *= -1;
            }
            K--;
        }

        return sum(A);
    }

    private int sum(int[] A) {
        int result = 0;
        for (int n : A) {
            result += n;
        }

        return result;
    }

}
