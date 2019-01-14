package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString387 {

    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) return -1;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.merge(s.charAt(i), 0, (a, b) -> a + 1);
//            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 0) return i;
        }

        return -1;
    }
}
