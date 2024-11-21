Given a binary tree, the task is to find the zigzag level order traversal of the tree. In zig zag traversal starting from the first level go from left to right for odd-numbered levels and right to left for even-numbered levels.

Example 1:

![image](https://github.com/user-attachments/assets/a07c93cb-e019-40ec-a89b-986daf722bab)

Input: root = [3,9,20,null,null,15,7] <br> 
Output: [[3],[20,9],[15,7]] <br>

Example 2: <br>
Input: root = [1] <br>
Output: [[1]] <br>

Example 3: <br>
Input: root = [] <br>
Output: []
 

Constraints:

- The number of nodes in the tree is in the range [0, 2000].
- -100 <= Node.val <= 100
