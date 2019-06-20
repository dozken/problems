package leetcode.easy;

import java.util.*;

public class MostCommonWord819 {

    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph += ".";
        Set<String> bannedWord = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        String result = "";

        StringBuilder sb = new StringBuilder();
        for (char aChar : paragraph.toCharArray()) {
            if (Character.isLetter(aChar)) {
                sb.append(Character.toLowerCase(aChar));
            } else if (sb.length() > 0) {
                String word = sb.toString();
                if (!bannedWord.contains(word)) {
                    map.put(
                            word,
                            map.getOrDefault(word, 0) + 1
                    );

                    if (map.get(word) > count) {
                        count = map.get(word);
                        result = word;
                    }
                }
                sb = new StringBuilder();
            }
        }
        return result;
    }


    public String mostCommonWordB(String paragraph, String[] banned) {
        Set<String> bannedWord = new HashSet<>(Arrays.asList(banned));

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", " ");

        System.out.println(paragraph);

        String[] words = paragraph.split("\\s+");

        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        String result = "";

        System.out.println(Arrays.toString(words));

        for (String word : words) {
            if (bannedWord.contains(word)) {
                continue;
            }

            map.put(
                    word,
                    map.getOrDefault(word, 0) + 1
            );

            if (map.get(word) > count) {
                count = map.get(word);
                result = word;
            }

        }

        return result;
    }
}
