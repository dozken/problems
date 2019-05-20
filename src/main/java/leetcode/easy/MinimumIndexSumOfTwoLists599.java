package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }

        int min = Integer.MAX_VALUE;

        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            if (map1.containsKey(list2[i])) {
                int p1 = map1.get(list2[i]);
                int indexSum = p1 + i;
                if (!map.containsKey(indexSum)) {
                    List<String> list = new ArrayList<>();
                    list.add(list2[i]);
                    map.put(indexSum, list);
                } else {
                    map.get(indexSum).add(list2[i]);
                }
                min = Math.min(indexSum, min);
            }
        }

        List<String> list = map.get(min);

        String[] result = new String[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
