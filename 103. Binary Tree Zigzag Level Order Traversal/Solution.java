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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzagTraversal = new ArrayList<>();
        
        if (root == null) 
            return zigzagTraversal;
        
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        
        boolean fromLeftToRight = false;
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            
            List<Integer> level = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.remove(0);
                
                level.add(node.val);
                
                if (node.left != null)
                    nodes.add(node.left);
                if (node.right != null)
                    nodes.add(node.right);              
            }
            
            if (fromLeftToRight)
                Collections.reverse(level);
            
            fromLeftToRight = !fromLeftToRight;
            zigzagTraversal.add(level);
        }
        
        return zigzagTraversal;
    }
}