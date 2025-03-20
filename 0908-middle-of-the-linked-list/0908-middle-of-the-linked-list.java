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
    public ListNode middleNode(ListNode head) {
    //boolean low = true? 
        ListNode r = new ListNode(0,head);
        ListNode s = r, f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s.next;
    }
}