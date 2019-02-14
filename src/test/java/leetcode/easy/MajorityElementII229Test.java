package leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementII229Test {

    @Test
    void majorityElement() {
    }

    @Test
    void majorityElementB() {
        MajorityElementII229 test = new MajorityElementII229();
        int[] nums = {1,1,1,2,2,3,3,3};
        List<Integer> integers = test.majorityElementB(nums);

        assertEquals(Arrays.asList(1,2), integers);
    }
}