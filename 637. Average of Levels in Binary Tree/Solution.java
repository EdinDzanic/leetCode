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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        
        while(!nodes.isEmpty()) {
            
            int size = nodes.size();
            double sum = 0;
            for(int i = 0; i < size; ++i){
                TreeNode temp = nodes.remove();
                sum += temp.val;
                
                if(temp.left != null) 
                    nodes.add(temp.left);
                if(temp.right != null) 
                    nodes.add(temp.right);
            }
            
            averages.add(sum / size);
        }
        
        return averages;
    }
}