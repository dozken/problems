package leetcode.easy;

public class DetectCapital520 {
    public boolean detectCapitalUse(String word) {
        if(word == null){
            throw new IllegalArgumentException();
        }
        if(word.length()<=1){
            return true;
        }

        boolean hasFirstCapital = word.charAt(0) >= 'A' && word.charAt(0) <= 'Z';
        boolean capital = hasFirstCapital;
        boolean upperCase = hasFirstCapital;
        boolean lowerCase = !hasFirstCapital;

        for(int i=1; i<word.length(); i++){
            char c = word.charAt(i);
            boolean isUpperCase = c >= 'A' && c <= 'Z';
            boolean isLowerCase = c >= 'a' && c <= 'z';
            upperCase &= isUpperCase;
            lowerCase &= isLowerCase;
            capital &= isLowerCase;
        }
        return upperCase || lowerCase || capital;
    }

    public boolean detectCapitalUseB(String word) {
        if(word == null){
            throw new IllegalArgumentException();
        }
        if(word.length() <= 1){
            return true;
        }

        char firstChar = word.charAt(0);
        boolean capital = isUpperCase(firstChar);
        boolean upperCase = capital;
        boolean lowerCase = isLowerCase(firstChar);

        for(int i=1; i<word.length(); i++){

            char aChar = word.charAt(i);

            upperCase &= isUpperCase(aChar);
            lowerCase &= isLowerCase(aChar);
            capital   &= isLowerCase(aChar);;
        }
        return upperCase || lowerCase || capital;
    }

    boolean isUpperCase(char c){
        return c >= 'A' && c <= 'Z';
    }

    boolean isLowerCase(char c){
        return c >= 'a' && c <= 'z';
    }
}
