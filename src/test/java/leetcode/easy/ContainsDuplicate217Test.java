package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicate217Test {

    private ContainsDuplicate217 test;

    @BeforeEach
    void setUp() {
        test = new ContainsDuplicate217();
    }


    @Test
    void containsDuplicate() {
        boolean containsDuplicate = test.containsDuplicate(new int[]{2, 3, 4, 5, 4});

        assertTrue(containsDuplicate);
    }

}