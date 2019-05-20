package leetcode.easy;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;

public class XofaKindinaDeckofCards914 {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length < 2) return false;

        Map<Integer, Integer> map = new HashMap<>();

        int min = Integer.MAX_VALUE;
        for (int i : deck) {
            if (map.containsKey(i)) {
                map.put(i, 1 + map.get(i));
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            min = Math.min(min, entry.getValue());
        }
        if (min == 1) return false;

        if (min % 2 == 0) {
            min = 2;
        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % min != 0) {
                return false;
            }
        }

        return true;
    }

    @Test
    public void test() {
        boolean b = hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3});
        assertFalse(b);
    }
}
