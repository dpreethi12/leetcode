/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> h = new HashMap<>();
        if(head == null)
            return null;
        Node d = new Node(head.val);
        h.put(head,d);
        Node t = d;
        Node k = d;
        while(head.next != null){
            d.next = new Node(head.next.val);
            d = d.next;
            head = head.next;
            h.put(head,d);
        }
        h.forEach((n,m) -> m.random = h.get(n.random));
        return t;
    }
}