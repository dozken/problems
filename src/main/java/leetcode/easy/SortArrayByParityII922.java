package leetcode.easy;

class SortArrayByParityII922 {
    public int[] sortArrayByParityII(int[] A) {
        int length = A.length;
        int[] result = new int[length];
        int evenIndex = 0;
        int oddIndex = 1;
        for (int number : A) {
            if (number % 2 == 0) {
                result[evenIndex] = number;
                evenIndex += 2;
            } else {
                result[oddIndex] = number;
                oddIndex += 2;
            }
        }
        return result;
    }
}
