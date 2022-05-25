package leetcode.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ValidPalindrome125 {

    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            char lChar = s.charAt(l);
            char rChar = s.charAt(r);
            if (!Character.isLetterOrDigit(lChar)) {
                l++;
            } else if (!Character.isLetterOrDigit(rChar)) {
                r--;
            } else if (Character.toLowerCase(lChar) == Character.toLowerCase(rChar)) {
                l++;
                r--;
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome1(String s) {
        StringBuffer sb = new StringBuffer();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        int l = 0, r = sb.length() - 1;
        while (l < r) {
            if (sb.charAt(l) != sb.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    @Test
    public void test() {
        String str = "A man, a plan, a canal: Panama";
        assertTrue(isPalindrome(str));
    }
}
