package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LongestStringChain1048 {

    public int longestStrChain(String[] words) {
        if (words == null || words.length == 0) {
            return 0;
        }

        int result = 0;
        Arrays.sort(words, Comparator.comparingInt(String::length));

        Map<String, Integer> dp = new HashMap<>();
        for (String w : words) {
            if (dp.containsKey(w))
                continue;

            dp.put(w, 1);

            for (int i = 0; i < w.length(); i++) {
                StringBuilder sb = new StringBuilder(w);
                String s = sb.deleteCharAt(i).toString();

                if (dp.containsKey(s) && dp.get(s) + 1 > dp.get(w))
                    dp.put(w, dp.get(s) + 1);

                if (dp.get(w) > result)
                    result = dp.get(w);
            }
        }
        return result;
    }
}
