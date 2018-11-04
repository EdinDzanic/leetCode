class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int current = nums[0];
        int j = 0;
        int i = 0;
        int count = 0;
        while (i < nums.length) {
            if (current == nums[i]) {
                if (count < 2) {
                    nums[j] = current;
                    j++;
                    count++;
                }
                i++;
            }
            else {
                count = 0;
                current = nums[i];
            }
        }
        
        return j;
    }
}