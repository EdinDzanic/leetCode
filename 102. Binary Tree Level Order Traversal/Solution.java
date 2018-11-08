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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> leverOrderTraversal = new ArrayList<>();
        if (root == null) return leverOrderTraversal;
        
        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(root);
        
        while (!treeNodes.isEmpty()) {
            
            List<Integer> level = new ArrayList<>();
            int size = treeNodes.size();
            for (int i = 0; i < size; i++) {
                
                TreeNode removed = treeNodes.remove(0);
                level.add(removed.val);
                
                if (removed.left != null)
                    treeNodes.add(removed.left);
                if (removed.right != null)
                    treeNodes.add(removed.right);
            }
            
            leverOrderTraversal.add(level);
        }
        
        return leverOrderTraversal;
    }
}