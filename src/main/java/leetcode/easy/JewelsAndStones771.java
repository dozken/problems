package leetcode.easy;

public class JewelsAndStones771 {
    public int numJewelsInStones(String J, String S) {
        int jewelStoneCount = 0;

        char[] stones = S.toCharArray();
        for (char stone : stones) {
            if (J.contains("" + stone)) {
                jewelStoneCount++;
            }
        }
        return jewelStoneCount;
    }
}

