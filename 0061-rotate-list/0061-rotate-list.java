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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int c = 0;
        while(temp != null) {
            c++;
            temp = temp.next;
        }
        if(c == 1 || c == 0) return head;
        k = k % c;
        while(k-- > 0) {
            ListNode x = head;
            while(x != null) {
                if(x.next.next == null) {
                    x.next.next = head;
                    head = x.next;
                    x.next = null;
                }
                x = x.next;
            }
        }
        return head;
    }
}