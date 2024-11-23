## Binary Tree Maximum Path Sum

A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root. The path sum of a path is the sum of the node's values in the path. Given the root of a binary tree, return the maximum path sum of any non-empty path.


Example 1:

![image](https://github.com/user-attachments/assets/44ed4f1c-849a-4c8e-b353-5b2335b7b143)

Input: root = [1,2,3] <br>
Output: 6 <br>
Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6. <br>


Example 2:

![image](https://github.com/user-attachments/assets/f5085c20-5fd3-4e20-b106-209656ab1c45)

Input: root = [-10,9,20,null,null,15,7] <br>
Output: 42 <br>
Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42. <br>
 

Constraints:

- The number of nodes in the tree is in the range [1, 3 * 104].
- -1000 <= Node.val <= 1000
