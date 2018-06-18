class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = ((nums.length + 1) * nums.length) / 2;
        
        int actualSum = 0;
        for(int num: nums)
            actualSum += num;
        
        return expectedSum - actualSum;
    }
}