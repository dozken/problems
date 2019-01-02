package leetcode.easy;

public class PalindromeNumber9 {

    public boolean isPalindrome(int x) {
//        String s= ""+x;
//        int length = s.length();
//        for(int i=0;i < length/2; i++){
//            if(!s.substring(i,i+1).equals(s.substring(length-i-1,length-i))){
//                return false;
//            }
//        }
//        return true;

        StringBuilder sb = new StringBuilder(x);
        return sb.toString().equals(sb.reverse().toString());
    }
}
