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
    void merge(ListNode h,ListNode sh){
        //ListNode th = h;
        while(h != null && sh != null){
            ListNode t = h.next;
            ListNode st = sh.next;
            h.next = sh;
            sh.next = t;
            
            h = t;
            sh = st;
        }
        
        //return th;
    }
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
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public void reorderList(ListNode head) {
        ListNode mid = findmid(head);
        ListNode sh = mid.next;
        mid.next = null;
        merge(head,rev(sh));

    }
}