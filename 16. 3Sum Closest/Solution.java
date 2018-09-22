class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0, n = nums.length; i < n; i++) {
            
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) 
                    closestSum = sum;
                
                if (sum == target)
                    return sum;
                else if (sum < target)
                    left++;
                else
                    right--;
            }
        }
        
        return closestSum;
    }
}