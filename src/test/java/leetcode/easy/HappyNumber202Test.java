package leetcode.easy;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HappyNumber202Test {

    HappyNumber202 test;

    @Before
    void init() {
        test = new HappyNumber202();
    }

    @Test
    void isHappy() {
        assertTrue(test.isHappy(19));
        assertFalse(test.isHappy(2));
//        assertFalse(test.isHappy(14));
//        assertTrue(test.isHappy(7));
    }

    @Test
    void isHappyB() {
        assertFalse(test.isHappyB(2));
    }
}