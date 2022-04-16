class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<>();
      if(root == null) {
          return ans;
      }
      Queue<Node> qu = new LinkedList<>();
      qu.add(root);
      while(!qu.isEmpty()) {
          int n = qu.size();
          for(int i = 1; i <= n; i++) {
              Node temp = qu.poll();
              if(i == 1) {
                  ans.add(temp.data);
              }
              if(temp.left != null) {
                  qu.add(temp.left);
              }
              if(temp.right != null) {
                  qu.add(temp.right);
              }
          }
      }
      return ans;
    }
}