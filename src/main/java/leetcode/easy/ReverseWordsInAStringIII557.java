package leetcode.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInAStringIII557 {
    public String reverseWords(String s) {
        String []arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            str = new StringBuilder(str).reverse().toString();
            sb.append(str).append(" ");
        }
        return sb.toString().trim();
    }

    public String reverseWordsB(String s) {
        return Arrays.stream(s.split(" "))
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                .collect(Collectors.joining(" "));
    }
}
