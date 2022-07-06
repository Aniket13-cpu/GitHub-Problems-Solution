class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node slowPtr = head;
        Node fastPtr = head;
        Node temp = null;
        while(fastPtr != null && fastPtr.next != null) {
            temp = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        temp.next = slowPtr.next;
        return head;
    }
}