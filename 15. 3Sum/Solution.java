class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int i = 0;
        while (i < nums.length) {
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    result.add(triplet);
                    
                    while (left + 1 < right && nums[left] == nums[left + 1])
                        left++;
                    left++;
                    
                    while (right - 1 > left && nums[right] == nums[right - 1])
                        right--;
                    right--;
                }
                else if (sum < 0)
                    left++;
                else
                    right--; 
            }
            
            while(i + 1 < nums.length && nums[i] == nums[i + 1])
                i++;
            i++;
        }
        
        return result;
    }
}