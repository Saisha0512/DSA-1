/*
 PROBLEM STATEMENT : 

 Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree. According to the
 definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the 
 lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of 
 itself).”

 Constraints:
 - The number of nodes in the tree is in the range [2, 10^5].
 - -10^9 <= Node.val <= 10^9
 - All Node.val are unique.
 - p != q
 - p and q will exist in the tree.
*/

import java.util.*;

public class rashmibarodiyaQ2LowestCommonAncestorOfABinaryTree {

    // Definition of a TreeNode (Binary Tree Node)
    static class TreeNode {
        int val;         // Node value
        TreeNode left;   // Left child
        TreeNode right;  // Right child

        TreeNode(int x) { val = x; }
    }

    /*
     Function: lowestCommonAncestor
     Finds the lowest common ancestor (LCA) of two given nodes in a binary tree.

    */
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        // Recursive calls to check left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If left is null, LCA is in the right subtree
        if (left == null) return right;
        // If right is null, LCA is in the left subtree
        if (right == null) return left;
        // If both are not null, root is the LCA
        return root;
    }

    /*
     Function: buildTree
     Builds a binary tree from an array representation using level-order traversal.
     
    */
    public static TreeNode buildTree(Integer[] nodes) {
        if (nodes == null || nodes.length == 0) return null;

        // Create the root node
        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        // Level-order traversal to construct the tree
        while (i < nodes.length) {
            TreeNode current = queue.poll();
            if (nodes[i] != null) {
                current.left = new TreeNode(nodes[i]);
                queue.offer(current.left);
            }
            i++;
            if (i < nodes.length && nodes[i] != null) {
                current.right = new TreeNode(nodes[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

    /*
     Function: findNode
     Finds a node with a given value in the binary tree.
    
    */
    public static TreeNode findNode(TreeNode root, int value) {
        if (root == null) return null;
        if (root.val == value) return root;
        TreeNode leftSearch = findNode(root.left, value);
        return (leftSearch != null) ? leftSearch : findNode(root.right, value);
    }

    public static void main(String[] args) {
        System.out.println("Outputs are -> ");

        // Example 1: Testing with root = [3,5,1,6,2,0,8,null,null,7,4]
        Integer[] nodes1 = {3,5,1,6,2,0,8,null,null,7,4};
        TreeNode root1 = buildTree(nodes1);
        TreeNode p1 = findNode(root1, 5);
        TreeNode q1 = findNode(root1, 1);
        System.out.println("LCA of 5 and 1: " + lowestCommonAncestor(root1, p1, q1).val); // Output: 3

        // Example 2: LCA of nodes 5 and 4
        TreeNode p2 = findNode(root1, 5);
        TreeNode q2 = findNode(root1, 4);
        System.out.println("LCA of 5 and 4: " + lowestCommonAncestor(root1, p2, q2).val); // Output: 5

        // Example 3: Small tree with root = [1, 2]
        Integer[] nodes2 = {1, 2};
        TreeNode root2 = buildTree(nodes2);
        TreeNode p3 = findNode(root2, 1);
        TreeNode q3 = findNode(root2, 2);
        System.out.println("LCA of 1 and 2: " + lowestCommonAncestor(root2, p3, q3).val); // Output: 1
    }
}



/*
 Overall Time and Space Complexity

1. lowestCommonAncestor(root, p, q) → O(N) time, O(H) space
2. buildTree(nodes) → O(N) time, O(N) space
3. findNode(root, value) → O(N) time, O(H) space

Since each function is independent and runs sequentially, the overall time complexity is:
O(N) + O(N) + O(N) = O(N)
 */