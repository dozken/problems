package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroes283Test {

    @Test
    void moveZeroes() {
        MoveZeroes283 test = new MoveZeroes283();
        int[] input = {0,1,0,3,12};
        test.moveZeroes(input);
        assertArrayEquals(new int[]{1,3,12,0,0}, input);
    }
}