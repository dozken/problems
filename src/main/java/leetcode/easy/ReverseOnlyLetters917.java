package leetcode.easy;

public class ReverseOnlyLetters917 {

    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int l = 0;
        int r = chars.length - 1;
        while (l < r) {
            boolean left = (chars[l] >= 'A' && chars[l] <= 'Z') || (chars[l] >= 'a' && chars[l] <= 'z');
            boolean right = (chars[r] >= 'A' && chars[r] <= 'Z') || (chars[r] >= 'a' && chars[r] <= 'z');

            if (left && right) {
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
                r--;
            } else if (left) {
                r--;
            } else if (right) {
                l++;
            } else {
                l++;
                r--;
            }

        }
        return new String(chars);
    }
    
}
