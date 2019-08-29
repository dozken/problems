package problems;

import java.util.HashMap;
import java.util.Map;

public class ClosestPrice {

    Map<Integer, Map<String, Integer>> map = new HashMap<>();
    int maxTime = Integer.MIN_VALUE;
    int minTime = Integer.MAX_VALUE;


    public void set(Integer time, String symbol, Integer price) {
        maxTime = Math.max(maxTime, time);
        minTime = Math.min(minTime, time);
        if (map.containsKey(time)) {
            Map<String, Integer> stock = map.get(time);
            stock.put(symbol, price);
        } else {
            Map<String, Integer> stock = new HashMap<>();
            stock.put(symbol, price);
            map.put(time, stock);
        }
    }

    public Integer get(Integer time, String symbol) { // 801
        if (map.containsKey(time)) {
            return map.get(time).get(symbol);
        } else {
            int r = time;
            int l = time;
            while (r <= maxTime || l >= minTime) {
                r++;
                l--;
                if (r <= maxTime && map.containsKey(r)) { // 802 803
                    return map.get(r).get(symbol);
                }
                if (l >= minTime && map.containsKey(l)) { // 800 799
                    return map.get(l).get(symbol);
                }
            }
        }

        return -1;
    }

}
