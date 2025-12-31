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
        ListNode prev = head;
        ListNode forward = head;
        if(head == null)
            return false;
        while (forward != null && forward.next != null)
        {
            prev = prev.next;
            forward = forward.next.next;
            if(prev == forward)
                return true;

        }

        return false;
    }
}