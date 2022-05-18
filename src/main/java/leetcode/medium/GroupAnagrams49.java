package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char []chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            List<String> val = map.getOrDefault(key, new ArrayList());
            val.add(str);
            map.put(key,val);
        }

        return new ArrayList<>(map.values());
    }

    // space O(n) + O(26*n)
    // time O(n*m)
    public List<List<String>> groupAnagrams2(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;

        // space: O(n)
        Map<String, List<String>> map = new HashMap<>();
        // time O(n)
        for (String str : strs) {

            //space O(26)
            char[] hash = new char[26];

            //time O(m)
            for (char c : str.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(hash);

            List<String> val = map.getOrDefault(key, new ArrayList());
            val.add(str);
            map.put(key, val);
        }

        res.addAll(map.values());


        return res;
    }
}
