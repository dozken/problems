package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumber202Test {

    @Test
    void isHappy() {
        HappyNumber202 test = new HappyNumber202();
//        assertTrue(test.isHappy(19));
        assertFalse(test.isHappy(2));
//        assertFalse(test.isHappy(14));
//        assertTrue(test.isHappy(7));
    }
}