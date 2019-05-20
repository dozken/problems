package leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAllAdjacentDuplicatesInString1047 {

    public String removeDuplicates(String S) {
        if(S == null){
            return null;
        }
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : S.toCharArray()){
            if(!stack.isEmpty() && stack.peekLast() == c){
                stack.pollLast();
            }else{
                stack.offerLast(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : stack){
            sb.append(c);
        }

        return sb.toString();
    }

}
