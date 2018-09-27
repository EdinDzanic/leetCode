/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode current = head.next;
        ListNode prev = new ListNode(-1);
        prev.next = head;
        
        while (head != null && head.next != null) {
            ListNode next = head.next;
            prev.next = next;
            head.next = head.next.next;
            next.next = head;
            prev = head;
            head = head.next;
        }
        
        return current;
    }
}