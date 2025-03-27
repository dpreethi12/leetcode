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
    ListNode rev(ListNode h){
        ListNode p = null;
        while(h != null){
            ListNode t = h.next;
            h.next = p;
            p = h;
            h = t;
        }
        return p;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = rev(l1);
        ListNode h2 = rev(l2);
        int s = 0;
        int c = 0;
        ListNode p = new ListNode(-1);
        ListNode t = p;
        while(h1 != null || h2 != null){
            s = h1 == null?0:h1.val;
            s += h2 == null?0:h2.val;
            s += c;
            p.next = new ListNode(s%10);
            c = s/10;
            p = p.next;
            if(h1 != null)
            h1 = h1.next;
            if(h2 != null)
            h2 = h2.next;
        }
        if(c != 0){
            ListNode n = new ListNode(c);
            p.next = n;
        }

        return rev(t.next);
    }
}