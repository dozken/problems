package leetcode.easy;

import java.util.Arrays;

public class SquaresOfASortedArray977 {
    public int[] sortedSquares(int[] A) {
        return Arrays.stream(A).map(i->i*i).sorted().toArray();
    }
}
