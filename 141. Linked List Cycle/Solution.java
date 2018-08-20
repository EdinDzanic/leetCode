/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {      
        ListNode current = head;
        while(current != null && current.next != null) {
            head = head.next;
            current = current.next.next;
            
            if(current == head)
                return true;
        }
        
        return false;
    }
}