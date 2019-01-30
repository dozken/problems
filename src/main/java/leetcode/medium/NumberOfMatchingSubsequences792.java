package leetcode.medium;

import java.util.Arrays;

class NumberOfMatchingSubsequences792 {
    int numMatchingSubseq(String S, String[] words) {
        return (int) Arrays.stream(words).filter(S::contains).count();
    }
}
