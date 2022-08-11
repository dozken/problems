package problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class TuringCom {

    //problem
    //[5,2,+,D,C]
    // + -> new score with adding prev two scores
    // D -> new score by doubling prev
    // C -> cancel prev score


    public int score(String ops[]) {
        int result = 0;

        Deque<Integer> stack = new ArrayDeque<>();

        for (String op : ops) {
            if ("+".equals(op)) {
                int prev1 = stack.pop();
                int prev2 = stack.peek();

                stack.push(prev1);
                stack.push(prev1 + prev2);
            } else if ("D".equals(op)) {
                int prev1 = stack.peek();
                stack.push(prev1 * prev1);
            } else if ("C".equals(op)) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        System.out.println(stack);

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    @Test
    public void test() {
        String ops[] = {"5", "2", "D", "C", "+"};

        int expected = 14; // 5 2 7;

        Assert.assertEquals(expected, score(ops));
    }
}
