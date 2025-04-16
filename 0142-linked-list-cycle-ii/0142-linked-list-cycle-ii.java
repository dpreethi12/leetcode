/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> h = new HashSet<>();
        h.add(head);
        while(head != null){
            if(h.contains(head.next)){
                return head.next;
            }
            head = head.next;
            h.add(head);
        }
        return null;
    }
}