package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumber9 {

    @Test
    public void testNegative121(){
        assertFalse(isPalindrome(-121));
    }

    @Test
    public void test121(){
        assertTrue(isPalindrome(121));
    }

    @Test
    public void test1221(){
        assertTrue(isPalindrome(1221));
    }

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
