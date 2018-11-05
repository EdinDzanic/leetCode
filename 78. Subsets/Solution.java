class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();
        generateSubsets(sets, 0, nums, new ArrayList<Integer>());
        
        return sets;
    }
    
    public void generateSubsets(List<List<Integer>> sets, int index, int[] nums, List<Integer> set) {
        sets.add(new ArrayList<Integer>(set));
        if (index >= nums.length) return;
        
        for (int i = index; i < nums.length; i++) {
            set.add(nums[i]);
            
            generateSubsets(sets, i + 1, nums, set);
            
            set.remove(set.size() - 1);
        }
        
    }
}