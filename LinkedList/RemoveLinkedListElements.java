// LeetCode Problem: RemoveLinkedListElements 203
// Solution by: @Pranav-P-S

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // while (head != null && head.val == val) {
        //     head = head.next;
        // }

        // ListNode temp = head;

        // while (temp != null && temp.next != null) {
        //     if (temp.next.val == val) {
        //         temp.next = temp.next.next;
        //     } else {
        //         temp = temp.next;
        //     }
        // }

        // if (head != null && head.val == val) return null;

        // return head;

        // Recursive Approach

        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) return null;

        head.next = removeElements(head.next, val);

        return head;
    }
}