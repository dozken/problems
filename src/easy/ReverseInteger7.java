package easy;

public class ReverseInteger7 {
    public static void main(String args[]) {
        ReverseInteger7 s = new ReverseInteger7();
        int b = 12 % 10;
        int a = s.reverse(1534236469);
    }

    public int reverse(int x) {
        return (int) recursive(0, x);
    }


    public long recursive(long x, long i) {
        if (i / 10 != 0) {
            long l = (x + i % 10) * 10;
            if (l >= Integer.MAX_VALUE | l <= Integer.MIN_VALUE)
                return 0;
            return recursive(l, i / 10);
        } else
            return x + i;
    }
}
