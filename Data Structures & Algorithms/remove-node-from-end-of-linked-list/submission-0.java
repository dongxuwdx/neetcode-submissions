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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = getListLen(head);
        int index = len - n;
        ListNode dummy = new ListNode(0, head);
        ListNode curr = dummy;
        while(curr!=null && index>0){
            curr = curr.next;
            index--;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }

    private int getListLen(ListNode head){
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }
}
