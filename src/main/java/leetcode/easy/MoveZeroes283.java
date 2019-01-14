package leetcode.easy;

public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
//        int counter = 0;
//        for (int num : nums) {
//            if (num != 0) {
//                nums[counter++] = num;
//            }
//        }
//
//        for (int i = counter; i<nums.length;i++){
//            nums[i] = 0;
//        }


        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[j] != 0) j++;
            else if (nums[i] != 0 && nums[j] == 0) {
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
        }
    }
}
