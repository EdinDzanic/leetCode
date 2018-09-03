/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode current = head;
        while(current != null) {
            current = current.next;
            size++;
        }
        
        if(size == 1 && n == 1)
            return null;
        
        size -= n;
        
        ListNode prev = new ListNode(0);
        prev.next = head;
        current = prev;
        while(size > 0) {
            current = current.next;
            size--;
        }
        
        current.next = current.next.next;
        
        return prev.next;
    }
}