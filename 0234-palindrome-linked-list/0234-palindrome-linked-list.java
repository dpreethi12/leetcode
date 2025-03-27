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
    ListNode findmid(ListNode h){
        ListNode s = h;
        ListNode f = h;
        while(f.next != null && f.next.next != null){
            s= s.next;
            f = f.next.next;
        }
        return s;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = findmid(head);
        ListNode sh = mid.next;
        mid.next = null;
        ListNode nsh = rev(sh);
        while(nsh != null){
            if(nsh.val != head.val){
                return false;
            }
            nsh = nsh.next;
            head = head.next;
        }
        return true;
    }
}