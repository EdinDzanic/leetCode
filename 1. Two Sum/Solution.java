class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(map.containsKey(nums[i]))
                return new int[] {i, map.get(nums[i])};
            
            map.put(target - nums[i], i);
        }

        return null;
    }
}