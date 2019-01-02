package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate217 {
    boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

    // this get time limit exception
//    public boolean containsDuplicate2(int[] nums) {
//        List<Integer> b = IntStream.of(nums)
//                .boxed()
//                .collect(Collectors.toList());
//        return b.stream()
//                .anyMatch(i -> Collections.frequency(b, i) > 1);
//    }
}
