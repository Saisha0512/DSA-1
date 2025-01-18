public class AvwalKaur_Q8_ConstructTree {
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

    // RECURSIVE SOLUTION
    public int findPosition(int[] in, int start, int end, int target) {
        int pos=-1;
        for(int i=start;i<=end;i++) {
            if(in[i]==target) pos=i;
        }
        return pos;
    }
    public Node constructTree(int[] pre, int[] in, int inStart, int inEnd, int idx) {
        // base case
        if(inStart>inEnd) return null;
        Node root=new Node(pre[idx]);
        int pos=findPosition(in, inStart, inEnd, pre[idx]);
        root.left=constructTree(pre, in, inStart, pos-1, idx+1);
        root.right=constructTree(pre, in, pos+1, inEnd, idx+(pos-inStart+1));
        return root;
    }
    public Node buildTree(int[] preorder, int[] inorder) {
        return constructTree(preorder, inorder, 0, inorder.length-1, 0);
    }
}
