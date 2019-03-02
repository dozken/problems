package leetcode.easy;

public class ExcelSheetColumnNumber171 {
    
    public int titleToNumber(String s) {
        if (s == null || s.isEmpty()) return 0;

        int result = 0;
        int alphabetSize = 'Z' - 'A' + 1;
        for (int i = 0; i < s.length(); i++) {
            result = (s.charAt(i) - 'A') + 1 + (alphabetSize * result);
        }

        return result;
    }
}
