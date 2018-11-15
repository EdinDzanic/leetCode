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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        
        return findMinDepth(root, 1);
    }
    
    public int findMinDepth(TreeNode root, int depth) {
        if (root == null || (root.left == null && root.right == null))
            return depth;
        
        depth++;
        
        if (root.left == null)
            return findMinDepth(root.right, depth);
        else if (root.right == null)
            return findMinDepth(root.left, depth);
        else
            return Math.min(findMinDepth(root.left, depth), findMinDepth(root.right, depth));
    }
}