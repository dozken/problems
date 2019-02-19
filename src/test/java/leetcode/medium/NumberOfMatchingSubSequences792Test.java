package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfMatchingSubSequences792Test {

    @Test
    void numMatchingSubSequence() {
        NumberOfMatchingSubsequences792 test = new NumberOfMatchingSubsequences792();
        int num = test.numMatchingSubSequence(new String[]{"a", "bb", "acd", "ace"});
        assertEquals(num, 3);
    }

}