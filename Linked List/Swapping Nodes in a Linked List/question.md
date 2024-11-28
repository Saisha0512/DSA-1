# Swapping Nodes in a Linked List

## Problem Description

You are given the head of a linked list and an integer `k`. The task is to swap the values of the `k`th node from the beginning and the `k`th node from the end of the list. 

**Note**: 
- The nodes are **1-based indexed**. 
- You are required to swap the values of the nodes, not the nodes themselves.

---

## Examples

### Example 1:
Given `head = [1,2,3,4,5]` and `k = 2`, the result will be `[1,4,3,2,5]`.  
### Example 2:
Given `head = [7,9,6,6,7,8,3,0,9,5]` and `k = 5`, the result will be `[7,9,6,6,8,7,3,0,9,5]`.

---

## Constraints

- The number of nodes in the list is in the range `[2, 10^5]`.
- `1 <= Node.val <= 100`.
- `1 <= k <= size of the list`.
- Indexing is **1-based**.


