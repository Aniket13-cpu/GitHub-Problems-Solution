class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node prev = null;
        Node curr = head;
        Set<Node> set = new HashSet<>();
        while(curr != null) {
            if(set.contains(curr)) {
                prev.next = null;
                return;
            }
            set.add(curr);
            prev = curr;
            curr = curr.next;
        }
        
    }
}