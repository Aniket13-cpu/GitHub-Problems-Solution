class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // Method 1:-
        // if(node == null) {
        //     return 0;
        // }
        // int leftHeight = height(node.left);
        // int rightHeight = height(node.right);
        // return Math.max(leftHeight, rightHeight) + 1;
        
        // Method 2
        if(node == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        int ht = 0;
        queue.add(node);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                Node temp = queue.remove();
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
            }
            ht++;
        }
        return ht;
    }
}