package leetcode.easy;

public class RobotReturntoOrigin657 {
    public boolean judgeCircle(String moves) {
        char[] C = moves.toCharArray();

        int x = 0, y = 0;
        for (char move : C) {
            switch (move) {
                case 'U':
                    y--;
                    break;
                case 'D':
                    y++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }
        return x == 0 && 0 == y;
    }
}
