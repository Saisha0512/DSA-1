# Partition List

## Problem Description

You are given the head of a singly linked list and an integer `x`. Your task is to partition the linked list such that all nodes with values less than `x` appear before nodes with values greater than or equal to `x`. 

The relative order of the nodes in each of the two partitions must be preserved.

---

## Examples

### Example 1:
Given the linked list:  
  `1 -> 4 -> 3 -> 2 -> 5 -> 2`  
  and `x = 3`,  
  The result is:  
  `1 -> 2 -> 2 -> 4 -> 3 -> 5`.  
### Example 2:
Given the linked list:  
  `2 -> 1`  
  and `x = 2`,  
  The result is:  
  `1 -> 2`.  

---

## Constraints

- The number of nodes in the list is in the range `[0, 200]`.
- `-100 <= Node.val <= 100`.
- `-200 <= x <= 200`.
