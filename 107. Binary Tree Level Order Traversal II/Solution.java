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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelOrderTraversal = new ArrayList<>();
        
        levelOrder(levelOrderTraversal, root, 1);
        
        return levelOrderTraversal;
    }
    
    public void levelOrder(List<List<Integer>> levelOrderTraversal, TreeNode current, int level) {
        if (current == null)
            return;
        
        if (levelOrderTraversal.size() < level)
            levelOrderTraversal.add(0, new ArrayList<Integer>());
        
        levelOrderTraversal.get(levelOrderTraversal.size() - level).add(current.val);
        
        levelOrder(levelOrderTraversal, current.left, level + 1);
        levelOrder(levelOrderTraversal, current.right, level + 1);
    }
}