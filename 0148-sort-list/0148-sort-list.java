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
    ListNode Mergesort(ListNode h){
        //sort 2 halves
        if(h == null || h.next == null){
            return h;
        }
        ListNode mid = findmid(h);
        ListNode f =h;
        ListNode sh = mid.next;
        mid.next = null;
        return merge(Mergesort(f),Mergesort(sh));

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
    ListNode merge(ListNode h, ListNode sh){
        ListNode d = new ListNode(-1);
        ListNode td = d;
        while(h != null && sh != null){
            if(h.val < sh.val){
                d.next = h;
                h = h.next;
            }else{
                d.next = sh;
                sh = sh.next;
            }
            d = d.next;
        }
        if(sh != null)
            h = sh;
        while(h != null){
            d.next = h;
            h = h.next;
            d = d.next;
        }
        return td.next;
    }
    public ListNode sortList(ListNode head) {
        return Mergesort(head);
    }
}