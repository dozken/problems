package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumber509Test {

    @Test
    void fib() {
        FibonacciNumber509 test = new FibonacciNumber509();
        assertEquals(2, test.fib(3));
    }
}