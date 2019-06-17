package leetcode.easy;

import java.util.*;

public class ValidParentheses20 {

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Deque<Character> stack = new ArrayDeque<>();
        for (char aChar : s.toCharArray()) {
            if (map.containsKey(aChar) && !stack.isEmpty()) {
                char leftParenthesis = stack.pop();
                if (map.get(aChar) != leftParenthesis) {
                    return false;
                }
            } else {
                stack.push(aChar);
            }
        }
        return stack.isEmpty();
    }

}
