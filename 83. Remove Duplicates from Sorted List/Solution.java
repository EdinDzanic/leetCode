/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        
        while(current != null) {
            if(prev != null && prev.val == current.val) {
                prev.next = current.next;
            }
            else {
                prev = current;
            }
            
            current = current.next;
        }
        
        return head;
    }
}