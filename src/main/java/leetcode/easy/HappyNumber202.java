package leetcode.easy;

public class HappyNumber202 {

    public boolean isHappy(int n) {
        if(n==1) return true;
        else if(n==0) return false;

        int maybeHappy = 0;
        int before = n;
        while(n!=0){
            int remainder = n%10;
            n = n/10;
            maybeHappy+= remainder * remainder;
        }

        return before != maybeHappy && isHappy(maybeHappy);
    }
}
