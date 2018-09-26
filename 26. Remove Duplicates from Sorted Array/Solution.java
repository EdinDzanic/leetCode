class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;       
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                length--;
            }
            else { 
                nums[j] = nums[i];
                j++;
            }
            
            i++;
        }
        
        return length;
    }
}