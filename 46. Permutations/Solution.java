class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        
        generate(nums, new ArrayList<Integer>(), permutations);
        
        return permutations;
    }
    
    public void generate(int[] nums, List<Integer> permutation, List<List<Integer>> permutations) {
        if (permutation.size() == nums.length)
            permutations.add(new ArrayList<Integer>(permutation));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (!permutation.contains(nums[i])) {
                    permutation.add(nums[i]);
                
                    generate(nums, permutation, permutations);
                
                    permutation.remove(permutation.size() - 1);
                }
            }
        }
    }
}