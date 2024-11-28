# Odd Even Linked List

## Problem Description

You are given the head of a singly linked list. Your task is to group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

- The relative order inside both the odd and even groups must remain the same.
- The first node is considered at index `1` (1-based indexing).

---

## Examples
### Example 1:  
Given the linked list:  
  `[1, 2, 3, 4, 5]`  
  The result is:  
  `[1, 3, 5, 2, 4]`.  
### Example 2:  
Given the linked list:  
  `[2, 1, 3, 5, 6, 4, 7]`  
  The result is:  
  `[2, 3, 6, 7, 1, 5, 4]`.  

---

## Constraints

- The number of nodes in the list is in the range `[0, 10^4]`.
- `-10^6 <= Node.val <= 10^6`.
