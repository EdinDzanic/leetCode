class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;

        int start = 0;
        int end = nums.length - 1;
        int pivot = -1;
        while (start <= end) {
            
            int middle = (start + end) / 2;
            if (nums[middle] == target)
                return middle;

            if (middle < nums.length - 1 && nums[middle] > nums[middle + 1]) {
                pivot = middle;
                break;
            }
            else if (nums[middle] < nums[start])
                end = middle - 1;
            else
                start = middle + 1;
        }
        
        if (pivot == -1) {
            start = 0;
            end = nums.length - 1;
        }
        else if (nums[0] <= target && target <= nums[pivot]) {
            start = 0;
            end = pivot;
        }
        else {
            start = pivot + 1;
            end = nums.length - 1;
        }
        
        while (start <= end) {           
            int middle = (start + end) / 2;
            if (nums[middle] == target)
                return middle;
            else if (target < nums[middle])
                end = middle - 1;
            else
                start = middle + 1;
        }
        
        return -1;
    }
}