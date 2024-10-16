/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = null;
        ListNode head = res;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ListNode temp = new ListNode(list1.val);
                list1 = list1.next;
                if(res==null){
                    res=temp;
                    head=res;
                }
                else{
                    res.next = temp;
                    res = res.next;
                }
            } else {
                ListNode temp = new ListNode(list2.val);
                list2 = list2.next;
                if(res==null){
                    res=temp;
                    head=res;
                }
                else{
                    res.next = temp;
                    res = res.next;
                }
            }
        }
        while (list2 != null) {
            ListNode temp = new ListNode(list2.val);
            list2 = list2.next;
            if(res==null){
                    res=temp;
                    head=res;
                }
                else{
                    res.next = temp;
                    res = res.next;
                }
        }

        while (list1 != null) {
            ListNode temp = new ListNode(list1.val);
            list1 = list1.next;
            if(res==null){
                    res=temp;
                    head=res;
                }
                else{
                    res.next = temp;
                    res = res.next;
                }
        }

        return head;
    }
}
