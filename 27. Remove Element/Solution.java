class Solution {
    public int removeElement(int[] nums, int val) {
        int newLength = nums.length;

        for(int i = 0; i < newLength; i++) {
            if(nums[i] == val) {
                newLength--;

                int j = nums.length - 1;
                while(j > i && nums[j] == val) {
                    j--;
                }

                if(j == i)
                    return j;
                
                nums[i] = nums[j];
                nums[j] = val;
            }
        }
        
        return newLength;
    }
}