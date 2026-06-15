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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int n = 0;
        while(temp != null) {
            n++;
            temp = temp.next;
        }
        if(n == 1) return null;
        n = n / 2;
        temp = head;
        for(int i = 0; i < n - 1; i++){
            temp = temp.next;
        }
        ListNode s = temp.next.next;
        temp.next.next = null;
        temp.next = s;
        return head;
    }
}