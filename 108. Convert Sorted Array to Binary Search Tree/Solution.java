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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return buildSubTree(nums,  0, nums.length - 1);
    }
    
    public TreeNode buildSubTree(int[] nums, int start, int end) {
        if (start > end) return null;
        
        int middle = (start + end) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        
        root.left = buildSubTree(nums, start, middle - 1);
        root.right = buildSubTree(nums, middle + 1, end);
        
        return root;
    }
}