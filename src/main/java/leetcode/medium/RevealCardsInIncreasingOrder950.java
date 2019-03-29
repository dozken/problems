package leetcode.medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import static org.junit.Assert.assertArrayEquals;

public class RevealCardsInIncreasingOrder950 {

    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> deque = new LinkedList<>();
        for (int i = deck.length - 1; i >= 0; i--) {
            if (deque.size() < 2) {
                deque.addFirst(deck[i]);
            } else {
                Integer last = deque.pollLast();
                deque.addFirst(last);
                deque.addFirst(deck[i]);
            }
        }
        int[] result = new int[deck.length];
        for (int i = 0; i < deck.length; i++) {
            result[i] = deque.pollFirst();
        }
        return result;
    }


    @Test
    public void deckRevealedIncreasing() {
        int[] result = deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7});

        assertArrayEquals(result, new int[]{2, 13, 3, 11, 5, 17, 7});
    }


}
