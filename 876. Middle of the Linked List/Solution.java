/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode current = head;
        while(current != null) {
            current = current.next;
            size++;
        }
        
        int mid = size / 2;
        ListNode middle = head;
        int i = 0;
        while(i < mid) {
            middle = middle.next;
            i++;
        }
        
        return middle;
    }
}