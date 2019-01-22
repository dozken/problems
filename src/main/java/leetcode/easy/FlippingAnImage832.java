package leetcode.easy;

public class FlippingAnImage832 {

    /*
    Can be improved by swapping values, rather than creating new array;
     */
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] flipped = new int[A.length][A.length];
        for(int i1=0, i2=0; i1 < A.length; i1++, i2++){
            for(int j1=A.length-1, j2=0; j1>=0; j1--, j2++){
                flipped[i2][j2] = A[i1][j1] == 1 ? 0 : 1;
            }
        }
        return flipped;
    }

}
