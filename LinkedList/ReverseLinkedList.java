// LeetCode Problem: ReverseLinkedList 206
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
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;

        ListNode next;
        ListNode prev;
        next=head.next;
        prev=head;
        head.next=null;
        while(next!=null){
            head=next;
            next=head.next;
            head.next=prev;
            prev=head;
        }
        
        return head;
    }
}
