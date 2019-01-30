package leetcode.easy;

import java.util.Arrays;

public class LargestPerimeterTriangle976 {

    public int largestPerimeter(int[] A) {
        A = Arrays.stream(A).filter(x->x>0).toArray();
        if(A.length<3) return 0;

        long sum = Arrays.stream(A)
                .boxed()
                .sorted((a,b)->b-a)
                .limit(3)
                .mapToInt(x->x)
                .sum();

        return (int) sum;
    }

}
