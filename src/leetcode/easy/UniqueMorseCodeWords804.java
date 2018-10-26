package leetcode.easy;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueMorseCodeWords804 {
    public static void main(String args[]){

        char a = 'a';
        System.out.println(a);
        UniqueMorseCodeWords804 s = new UniqueMorseCodeWords804();
        String [] words = {"gin", "zen", "gig", "msg"};
        s.uniqueMorseRepresentations(words);

    }

    public int uniqueMorseRepresentations(String[] words) {
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

//        Set<String> collect = Arrays.stream(words).flatMapToInt(w -> w.chars()).mapToObj(c -> morse[(char) c - 'a'])
//                .collect(Collectors.toSet());
//
//        return collect.size()
//        ;
        Set<String> set = new HashSet<>();
        for(String word : words){
            String collect = word.chars()
                    .mapToObj(c -> morse[(char)c - 'a'])
                    .collect(Collectors.joining());
            set.add(collect);
        }
        return set.size();
    }
}