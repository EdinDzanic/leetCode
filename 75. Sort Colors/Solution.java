class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right && i <= right) {
            if (nums[i] == 0 && i > left) {
                nums[i] = nums[left];
                nums[left] = 0;
                left++;
            }
            else if (nums[i] == 2) {
                nums[i] = nums[right];
                nums[right] = 2;
                right--;
            }
            else
                i++;
        }
    }
}