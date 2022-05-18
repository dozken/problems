package leetcode.medium;

public class ProductOfArrayExceptSelf238 {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int pre = 1;
        for(int i = 0; i < nums.length; i++){
            result[i] = pre;
            pre = nums[i] * pre;
        }

        pre = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            result[i] *= pre;
            pre = nums[i] * pre;
        }

        return result;
    }
}
