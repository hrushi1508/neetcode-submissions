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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l2 = slow.next;
        slow.next = null;
        fast = rev(l2);
        slow = head;
        merge(head,fast);
    }
    public static ListNode rev(ListNode ls){
        ListNode prev = null;
        while(ls!=null){
            ListNode temp = ls;
            ls = ls.next;
            temp.next = prev;
            prev = temp;
        }
        return prev;
    }
    public void merge(ListNode l1, ListNode l2) {
    while (l1 != null && l2 != null) {
        ListNode next1 = l1.next;
        ListNode next2 = l2.next;

        l1.next = l2;
        l2.next = next1;

        l1 = next1;
        l2 = next2;
    }
    }
}
