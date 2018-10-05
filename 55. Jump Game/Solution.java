class Solution {
    public boolean canJump(int[] nums) {
        int start = 0;
        while (start < nums.length - 1) {
            if (nums[start] == 0)
                return false;
            
            int i = start + 1;
            int jump = i;
            i++;
            while (i < nums.length && i <= start + nums[start]) {
                if (nums[i] + i >= nums[jump] + jump)
                    jump = i;
                i++;
            }
            
            start = jump;
        }
        
        return true;
    }
}