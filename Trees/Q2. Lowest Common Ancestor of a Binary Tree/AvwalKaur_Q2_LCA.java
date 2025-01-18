import java.util.ArrayList;

public class AvwalKaur_Q2_LCA {
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
    // APPROACH I -> TC=O(3n), SC=O(2n)
    boolean findPath(ArrayList<Node> ll, Node root, Node n) {
        // to find the path from node root to node n
        if(root==null) return false;
        ll.add(root);
        if(root.data==n.data) return true;

        boolean left=findPath(ll, root.left, n);
        boolean right=findPath(ll, root.right, n);
        if(left || right) return true; // if from either of the subtrees, we get the node
        // if we are not able to find the node from any of the subtrees, we will remove the last added node
        ll.remove(ll.size()-1);
        return false;
    }
    public Node LCA1(Node root, Node n1, Node n2) {
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        // find the path from root node to nodes n1 and nodes n2 
        findPath(path1, root, n1);
        findPath(path2, root, n2);

        // LCA will the last common node in both the lists
        int i=0;
        for(;i<path1.size() && i<path2.size();i++) {
            if(path1.get(i)!=path2.get(i)) break;
        }
        return path1.get(i-1);
    }

    // APPROACH II -> TC=O(n), SC=O(n)
    // LCA is the first node in tree whose left or right subtree contains both the nodes that need to be found
    public Node LCA2(Node root, Node n1, Node n2) {
        if(root==null || root.data==n1.data || root.data==n2.data) return root;
        Node left=LCA2(root.left, n1, n2);
        Node right=LCA2(root.right, n1, n2);
        if(left==null) return right;
        if(right==null) return left;
        return root;
    }

}
