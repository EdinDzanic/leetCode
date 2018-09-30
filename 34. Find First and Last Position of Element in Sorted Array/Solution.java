class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        range[0] = -1; 
        range[1] = -1;
        
        int start = 0; 
        int end = nums.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            
            if (nums[middle] == target) {
                if (middle < end && nums[middle + 1] == target)
                    start = middle + 1;
                else {
                    range[0] = middle;
                    range[1] = middle;
                    break;
                }
            }
            else if (nums[middle] < target)
                start = middle + 1;
            else
                end = middle - 1;
        }
        
        start = 0; 
        end = range[0];
        while (start <= end) {
            int middle = (start + end) / 2;
            
            if (nums[middle] == target) {
                if (middle > start && nums[middle - 1] == target)
                    end = middle - 1;
                else {
                    range[0] = middle;
                    break;
                }
            }
            else if (nums[middle] < target)
                start = middle + 1;
            else
                end = middle - 1;
        }
        
        return range;
    }
}