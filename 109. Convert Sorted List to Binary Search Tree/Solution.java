/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) 
            return null;
        return convert(head, null);
    }
    
    public TreeNode convert(ListNode start, ListNode end) {
        if (start == end) return null;
        
        ListNode slow = start;
        ListNode fast = start;
        
        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        TreeNode root = new TreeNode(slow.val);
        
        root.left = convert(start, slow);
        root.right = convert(slow.next, end);
        
        return root;
    }
}