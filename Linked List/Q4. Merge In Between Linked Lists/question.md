# Merge In Between Linked Lists

## Problem Description

You are given two linked lists: `list1` and `list2`, and two integers `a` and `b`. The task is to merge `list2` into `list1` such that:

1. Remove all the nodes of `list1` from index `a` to index `b` (inclusive, **0-based indexing**).
2. Insert `list2` in place of the removed nodes.

The resulting list should maintain the order of the nodes.

---

## Examples

### Example 1:
Given `list1 = [0,1,2,3,4,5]`, `list2 = [1000000,1000001,1000002]`, `a = 3`, and `b = 4`, the result will be `[0,1,2,1000000,1000001,1000002,5]`.  
### Example 2:
Given `list1 = [0,1,2,3,4,5,6]`, `list2 = [10,20,30,40]`, `a = 2`, and `b = 5`, the result will be `[0,1,10,20,30,40,6]`.

---

## Constraints

- The number of nodes in `list1` is in the range `[1, 10^4]`.
- The number of nodes in `list2` is in the range `[1, 10^4]`.
- `0 <= Node.val <= 10^5`.
- `0 <= a <= b < len(list1)`.
- Indexing starts from **0**.
