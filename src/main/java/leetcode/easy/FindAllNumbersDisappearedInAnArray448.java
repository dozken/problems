package leetcode.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAllNumbersDisappearedInAnArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return IntStream.rangeClosed(1, nums.length)
                .boxed()
                .filter(i->numbers.add(i))
                .collect(Collectors.toList());
    }
}
