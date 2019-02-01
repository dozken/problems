package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {
    //	33 ms	java
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length())
            return false;

        Map<Character, Integer> letters = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            char c  = magazine.charAt(i);
            letters.put(c, letters.getOrDefault(c, 0)+1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char c  = ransomNote.charAt(i);
            if(letters.get(c) == null || letters.get(c) == 0){
                return false;
            }
            letters.put(c, letters.get(c)-1);
        }

        return true;
    }
}
