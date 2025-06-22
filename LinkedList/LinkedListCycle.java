// LeetCode Problem: LinkedListCycle 141
// Solution by: @Pranav-P-S

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
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode turtle = head;
        ListNode hare = head;
        
        while (hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
            
            if (hare == turtle) {
                return true;  // Cycle detected
            }
        }
        
        return false;  // Hare reached the end
    }
}
