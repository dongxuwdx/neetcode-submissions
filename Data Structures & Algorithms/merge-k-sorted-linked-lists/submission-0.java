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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        int interval = 1;
        while(interval < lists.length){
            // 0 1 - 2 3 - 4 5 - 6 7
            // 0 2 - 4 6
            for(int i = 0;i+interval<lists.length;i+=interval*2){
                lists[i] = mergeListNodes(lists[i], lists[i+interval]);
            }
            interval*=2;
        }
        return lists[0];
    }

    private ListNode mergeListNodes(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l1!=null&&l2!=null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1!=null){
            curr.next = l1;
        }
        if(l2!=null){
            curr.next = l2;
        }
        return dummy.next;
    }
}
