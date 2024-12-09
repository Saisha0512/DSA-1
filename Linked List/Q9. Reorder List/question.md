# Reorder List

## Problem Description

You are given the head of a singly linked-list. The list can be represented as:

 L0 → L1 → … → Ln - 1 → Ln

Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …

Reorder the list **in-place**, meaning you cannot use extra space for another linked list.

---

## Examples

### Example 1:
Given the input list `[1,2,3,4]`, the reordered list will be `[1,4,2,3]`.
### Example 2:
 Given the input list `[1,2,3,4,5]`, the reordered list will be `[1,5,2,4,3]`.

---

## Constraints

- The number of nodes in the list is in the range `[1, 10*5]`.
- `1 <= Node.val <= 1000`


