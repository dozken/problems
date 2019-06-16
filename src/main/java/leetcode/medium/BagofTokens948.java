package leetcode.medium;

import java.util.Arrays;

public class BagofTokens948 {

    public int bagOfTokensScore(int[] tokens, int P) {
        if (tokens == null || tokens.length == 0 || P == 0) {
            return 0;
        }

        Arrays.sort(tokens);

        int points = 0;
        int result = 0;
        int i = 0, j = tokens.length - 1;

        while (i <= j) {
            if (tokens[i] <= P) {
                result = Math.max(result, ++points);
                P -= tokens[i++];
            } else if (points > 0) {
                --points;
                P += tokens[j--];
            } else {
                break;
            }
        }


        return result;
    }

}
