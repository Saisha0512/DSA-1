# Delete Middle of the Linked List

## Problem Description

You are given the head of a singly linked list. Your task is to delete the middle node of the linked list and return its head.

- If the list has an even number of nodes, delete the **second middle node**.
- The list must remain connected after deleting the node.

**Note**:  
The middle node is the `(n // 2) + 1`-th node for a list of size `n` (1-based indexing).

---

## Examples

### Example 1: 
Given `head = [1,2,3,4,5]`, the result will be `[1,2,4,5]`.
### Example 2:   
Given `head = [1,2,3,4,5,6]`, the result will be `[1,2,3,5,6]`.
### Example 3:   
Given `head = [1]`, the result will be `[]` (empty list).  

---

## Constraints

- The number of nodes in the list is in the range `[1, 10^5]`.
- `1 <= Node.val <= 100`.
- The input list is non-empty.
