import java.util.*;

public class AvwalKaur_Q1_ZigZagTraversal{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public List<List<Integer>> zigZagTraversal(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean flag=true; // to indicate the changing levels
        while(!q.isEmpty()) {
            int n=q.size();
            LinkedList<Integer> ll=new LinkedList<>();
            
            for(int i=0;i<n;i++) {
                Node curr=q.remove();
                if(flag==true) ll.addLast(curr.data);
                else ll.addFirst(curr.data);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            flag=!flag;
            ans.add(ll);
        }
        return ans;
    }
}