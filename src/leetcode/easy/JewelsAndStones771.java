package leetcode.easy;

public class JewelsAndStones771 {
    public static void main(String args[]){
        String J = "aA", S = "aAAbbbb";
        JewelsAndStones771 s = new JewelsAndStones771();
        s.numJewelsInStones(J,S);

    }

    public int numJewelsInStones(String J, String S) {
        int jewelStoneCount = 0;

        char [] stones = S.toCharArray();
        for(char stone: stones){
            if(J.contains(""+stone)){
                jewelStoneCount++;
            }
        }
        return jewelStoneCount;
    }
}

