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
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null && slow.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return getCycleStart(head, fast);
            }
        }
        return null;
    }

    private ListNode getCycleStart(ListNode head,ListNode fast){
        ListNode temp = head;
        while(temp!=fast){
            temp=temp.next;
            fast=fast.next;
        }
        return fast;
    }
}
