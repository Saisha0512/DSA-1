import java.util.*;

public class AvwalKaur_Q5_SymmetricTree {
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

    // RECURSIVE APPROACH
    boolean isSymmetric(Node root1, Node root2) {
        if(root1==null && root2==null) return true;

        if((root1.data!=root2.data) || (root1==null && root2!=null) || (root1!=null && root2==null)) {
            return  false;
        }
        boolean left=isSymmetric(root1.left, root2.right);
        boolean right=isSymmetric(root1.right, root2.left);
        return left && right;
    }
    public boolean isSymmetricTree(Node root) {
        if(root==null) return true;
        return isSymmetric(root.left, root.right);
    }


    // ITERATIVE APPROACH
    public boolean isSymmetricIterative(Node root) {
        if(root==null) return true;
        Queue<Node> q=new LinkedList<>();
        q.add(root.left);
        q.add(root.right);

        // everytime compare the first two values in the queue
        // first two values are node1's left and node2's right
        while(!q.isEmpty()) {
            Node root1=q.remove();
            Node root2=q.remove();
            if(root1==null && root2==null) continue;
            if(root1==null || root2==null || root1.data!=root2.data) return false;
            q.add(root1.left);
            q.add(root2.right);
            q.add(root1.right);
            q.add(root2.left);
        }
        return true;
    }
}
