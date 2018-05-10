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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null)
            return null;
        
        TreeNode root;
        if(t1 != null) {
            if(t2 != null)
                root = new TreeNode(t1.val + t2.val);
            else
                root = new TreeNode(t1.val);
        } else
            root = new TreeNode(t2.val);
        
        TreeNode left1 = t1 == null ? null : t1.left;
        TreeNode left2 = t2 == null ? null : t2.left;
        TreeNode right1 = t1 == null ? null : t1.right;
        TreeNode right2 = t2 == null ? null : t2.right;
        
        root.left = mergeTrees(left1, left2);
        root.right = mergeTrees(right1, right2);
        
        return root;
    }
}