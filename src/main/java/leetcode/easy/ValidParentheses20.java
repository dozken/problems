package leetcode.easy;

import java.util.*;

public class ValidParentheses20 {
    Map<Character, Character> map = new HashMap<Character, Character>(){{
        put(')', '(');
        put('}', '{');
        put(']', '[');
    }};
    public boolean isValid(String s) {


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

    public boolean isValid2(String s) {
        if(s.length() == 1) return false;

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            char next = s.charAt(i);

            if(!map.containsKey(next)){
                stack.push(next);
            }else{
                if(stack.isEmpty()) return false;

                char prev = stack.pop();
                if(prev != map.get(next))
                    return false;
            }
        }

        return stack.isEmpty();
    }

}
