package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharacters3 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }

        int result = 0;
        for (int c = 0; c < s.length(); c++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(c));
            for (int i = c + 1; i < s.length(); i++) {
                char aChar = s.charAt(i);
                if (sb.indexOf(String.valueOf(aChar)) != -1) {
                    result = Math.max(result, sb.length());
                    sb = new StringBuilder();
                    sb.append(aChar);
                } else {
                    sb.append(aChar);
                }
            }
            result = Math.max(result, sb.length());
        }

        return result;
    }

    @Test
    public void test() {
        int dvdf = lengthOfLongestSubstring("loddktdji");
        assertEquals(5, dvdf);
    }
}
