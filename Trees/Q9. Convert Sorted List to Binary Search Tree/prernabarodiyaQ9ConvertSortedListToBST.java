import java.util.*;

public class prernabarodiyaQ9ConvertSortedListToBST {
    public static TreeNode sortedListToBST(ListNode head) { 
        if(head == null) return null;

        return helper(head, null);
    }

    private static TreeNode helper(ListNode head, ListNode end) {
        ListNode fast = head;
        ListNode slow = head;

        if(head == end) return null;
        while(fast != end && fast.next != end){
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode newNode = new TreeNode(slow.val);

        newNode.left = helper(head, slow);
        newNode.right = helper(slow.next, end);
        
        return newNode;
    } 

    public static void main(String[] args) {
        // Create linked list from input: [-10, -3, 0, 5, 9]
        int[] values = {-10, -3, 0, 5, 9};
        ListNode head = createLinkedList(values);

        // Convert the sorted linked list to a BST
        TreeNode root = sortedListToBST(head);

        // Print the tree in the required format
        System.out.println(treeToString(root));
    }

    // Utility method to create a linked list from an array
    private static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Utility method to convert a binary tree to a string in level-order format
    private static String treeToString(TreeNode root) {
        if (root == null) return "[]";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        sb.append("[");
    
        // Perform level-order traversal and track the last non-null node
        int lastNonNullIndex = -1;
        List<TreeNode> nodes = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            nodes.add(current);
            if (current != null) {
                queue.add(current.left);
                queue.add(current.right);
            }
        }
    
        // Find the last non-null node index
        for (int i = nodes.size() - 1; i >= 0; i--) {
            if (nodes.get(i) != null) {
                lastNonNullIndex = i;
                break;
            }
        }
    
        // Build the string up to the last non-null node
        for (int i = 0; i <= lastNonNullIndex; i++) {
            TreeNode node = nodes.get(i);
            if (node == null) {
                sb.append("null,");
            } else {
                sb.append(node.val).append(",");
            }
        }
    
        // Remove the trailing comma
        sb.setLength(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }
    
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}
