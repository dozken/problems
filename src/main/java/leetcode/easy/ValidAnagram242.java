package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {

    // Space complexity O(26)
    // time complexity O(s+t+26)
    public boolean isAnagram(String s, String t) {
        // Space complexity O(26)
        int[] abc = new int[26];

        // time complexity O(s)
        for (char c : s.toCharArray()) {
            abc[c - 'a']++;
        }

        // time complexity O(t)
        for (char c : t.toCharArray()) {
            abc[c - 'a']--;
        }

        // time complexity O(26)
        for (int l : abc) {
            if (l != 0) return false;
        }

        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() != 0)
                return false;
        }

        return true;
    }

}
