package leetcode.easy;

import java.util.Arrays;

public class AssignCookies455 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
            }
            j++;

        }

        return i;

    }

    public int findContentChildrenB(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    s[j] = 0;
                    result++;
                    break;
                }
            }
        }

        return result;
    }
}
