package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowelsfromaString1119 {
    public String removeVowels(String S) {
        if (S == null || S.isEmpty()) {
            return S;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char letter = S.charAt(i);
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;
                default:
                    sb.append(letter);
                    break;
            }
        }

        return sb.toString();
    }

    public String removeVowelsB(String S) {
        StringBuilder sb = new StringBuilder();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for (int i = 0; i < S.length(); i++) {
            char aChar = S.charAt(i);
            if (isNotVowel(aChar)) {
                sb.append(aChar);
            }
        }

        return sb.toString();
    }

    private boolean isNotVowel(char aChar) {
        return aChar != 'a'
                && aChar != 'e'
                && aChar != 'i'
                && aChar != 'o'
                && aChar != 'u';
    }
}
