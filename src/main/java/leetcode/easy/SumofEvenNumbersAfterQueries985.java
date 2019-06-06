package leetcode.easy;

public class SumofEvenNumbersAfterQueries985 {

    //time O(N * N) where N = number array
    //space O(N)
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[A.length];

        int evenSum = evenSum(A);

        for (int i = 0; i < A.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];

            if (A[index] % 2 == 0) {
                evenSum -= A[index];
            }

            A[index] += val;
            if (A[index] % 2 == 0) {
                evenSum += A[index];
            }

            result[i] = evenSum;
        }

        return result;
    }

    public int evenSum(int[] A) {
        int result = 0;
        for (int n : A) {
            if (n % 2 == 0) {
                result += n;
            }
        }

        return result;
    }
    
}
