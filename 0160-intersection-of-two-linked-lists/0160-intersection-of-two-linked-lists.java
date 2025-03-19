/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n = headB;
        while(headA != null){
            headB = n;
            while(headB != null){
                if(headA == headB){
                    return headA;
                }else{
                    headB = headB.next;
                }
            }
            headA = headA.next;
        }
        return null;
    }
}