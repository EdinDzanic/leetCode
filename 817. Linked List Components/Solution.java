/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        int num = G.length;
        
        boolean[] elements = new boolean[10000];
        for(int val: G)
            elements[val] = true;
        
        boolean isPreviousInG = false;
        while(head != null) {
            
            if(isPreviousInG && elements[head.val])
                num--;
            
            isPreviousInG = elements[head.val];
            
            head = head.next;
        }
        
        return num;
    }
}