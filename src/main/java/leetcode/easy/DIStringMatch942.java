package leetcode.easy;

class DIStringMatch942 {
    public int[] diStringMatch(String S) {
        if (S == null || S.equals("")) {
            throw new IllegalArgumentException("S is empty!");
        }

        int[] result = new int[S.length() + 1];
        int inc = 0;
        int dec = S.length();
        for (int i = 0; i < result.length - 1; i++) {
            if (S.charAt(i) == 'I') {
                result[i] = inc;
                inc++;
            } else {
                result[i] = dec;
                dec--;
            }
        }
        result[S.length()] = inc;

        return result;
    }
}
