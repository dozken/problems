package leetcode.easy;

import java.util.ArrayList;
import java.util.List;


class SelfDividingNumbers728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i))
                result.add(i);
        }

        return result;
    }

    private boolean isSelfDividing(int num) {
        int number = num;

        while (number > 0) {
            int digit = (number % 10);
            if (digit == 0)
                return false;

            if (num % digit != 0)
                return false;

            number /= 10;
        }

        return true;
    }
}
