class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) return;

        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] < nums[j]) {
                    swap(nums, i, j);
                    
                    int left = i + 1;
                    int right = nums.length - 1;
                    while (left < right) {
                        swap(nums, left++, right--);
                    }
                    return;
                }
            }
        }
        
        Arrays.sort(nums);
    }
    
    private void swap(int[] nums,int left, int right){
        int temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}