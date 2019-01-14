package leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllNumbersDisappearedInAnArray448Test {

    @Test
    void findDisappearedNumbers() {
        FindAllNumbersDisappearedInAnArray448 test = new FindAllNumbersDisappearedInAnArray448();
        int[] input = {4,3,2,7,8,2,3,1};
        List<Integer> expected = Arrays.asList(5,6);
        List<Integer> actual = test.findDisappearedNumbers(input);
        assertEquals(expected, actual);
    }
}