package leetcode.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsinaString438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();


        int i = 0;
        int window = p.length();
        while (i <= s.length() - window) {
            String str = s.substring(i, window + i);

            boolean isAnagram = true;
            for (String aChar : p.split("")) {
                if (str.contains(aChar)) {
                    str = str.replaceFirst(aChar, "");
                } else {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                result.add(i);
            }

            i++;
        }

        return result;
    }


    @Test
    public void test() {
        findAnagrams("baa", "aa");
    }
}
