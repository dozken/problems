package leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberOfMatchingSubsequences792Test {

    @Test
    void numMatchingSubseq(){
        NumberOfMatchingSubsequences792 test = new NumberOfMatchingSubsequences792();
        int abcde = test.numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"});
        assertEquals(abcde, 3);
    }

}