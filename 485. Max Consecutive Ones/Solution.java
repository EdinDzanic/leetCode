class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0;
        int consecutive = 0;
        
        for(int num: nums) {
            if(num == 0) {
                maxConsecutive = Math.max(maxConsecutive, consecutive);
                consecutive = 0;
            }
            else
                consecutive++;
        }

        maxConsecutive = Math.max(maxConsecutive, consecutive);
        return maxConsecutive;
    }
}