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

    public String reverseOnlyLettersB(String S) {
        if (S == null)
            throw new IllegalArgumentException("String is null");
        if (S.length() < 2)
            return S;

        char[] chars = S.toCharArray();
        int leftIndex = 0;
        int rightIndex = chars.length - 1;
        char temp;
        while (leftIndex < rightIndex) {
            boolean isLeftLetter = isLetter(chars[leftIndex]);
            boolean isRightLetter = isLetter(chars[rightIndex]);

            if (!isLeftLetter) {
                leftIndex++;
            }
            if (!isRightLetter) {
                rightIndex--;
            }
            if (isLeftLetter && isRightLetter) {
                temp = chars[leftIndex];
                chars[leftIndex] = chars[rightIndex];
                chars[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        return String.valueOf(chars);
    }

    private boolean isLetter(char aChar) {
        return ((aChar >= 'A') && (aChar <= 'Z')) || ((aChar >= 'a') && (aChar <= 'z'));
    }

}
