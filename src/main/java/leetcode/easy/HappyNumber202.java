package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class HappyNumber202 {

    boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while (slow != fast);

        return slow == 1;
    }

    private int digitSquareSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }

    boolean isHappyB(int n) {
        if(n==1) return true;
        else if(n==0) return false;
        Set<Integer> set = new HashSet<>();
        int sumSquare = 0;
        int digit;
        while (true) {
            digit = n % 10;
            n = n/10;
            sumSquare += digit * digit;
            if (n == 0) {
                if (sumSquare == 1)
                    return true;
                if (!set.add(sumSquare))
                    return false;
                n = sumSquare;
                sumSquare = 0;
            }
        }
    }
}
