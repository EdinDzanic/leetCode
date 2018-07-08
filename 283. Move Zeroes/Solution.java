class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroes = 0 ;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[nonZeroes] = nums[i];
                if(i != nonZeroes)
                    nums[i] = 0;
                nonZeroes++;
            }
        }
    }
}