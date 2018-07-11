/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int start = 0;
        int end = nums.length;
        return constructTree(start, end, nums);
    }
    
    public TreeNode constructTree(int start, int end , int[] nums) {
        if(start >= end)
            return null;
        
        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        for(int i = start; i < end; i++)
            if(nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }      
        
        TreeNode root = new TreeNode(max);
        root.left = constructTree(start, maxIndex, nums);
        root.right = constructTree(maxIndex + 1, end, nums);
        
        return root;
    }
}