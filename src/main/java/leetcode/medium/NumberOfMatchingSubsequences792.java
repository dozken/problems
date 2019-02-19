package leetcode.medium;

import java.util.Arrays;

class NumberOfMatchingSubsequences792 {
    int numMatchingSubSequence(String[] words) {
        return (int) Arrays.stream(words).filter("abcde"::contains).count();
    }
}
