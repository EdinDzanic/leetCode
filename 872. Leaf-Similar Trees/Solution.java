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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> sequence1 = new ArrayList<>();
        List<Integer> sequence2 = new ArrayList<>();
        
        leafValueSequence(root1, sequence1);
        leafValueSequence(root2, sequence2);
        
        return sequence1.equals(sequence2);
    }
    
    public void leafValueSequence(TreeNode root, List<Integer> sequence) {
        if(root == null) return;
        
        if(root.left == null && root.right == null)
            sequence.add(root.val);
        else {
            leafValueSequence(root.left, sequence);
            leafValueSequence(root.right, sequence);
        }
    }
}