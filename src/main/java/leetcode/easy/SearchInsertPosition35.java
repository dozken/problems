package leetcode.easy;

public class SearchInsertPosition35 {

    public int searchInsert(int[] nums, int target) {
        int lenght = nums.length;
        if(lenght == 0) return 0;
        for(int i=0; i<lenght; i++){
            if(target<=nums[i])
                return i;
        }
        return lenght;
    }
    
}
