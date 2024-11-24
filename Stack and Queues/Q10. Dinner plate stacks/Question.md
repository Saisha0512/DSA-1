# 1172. Dinner Plate Stacks

## Problem Statement
You have an infinite number of stacks arranged in a row and numbered (left to right) from 0. Each stack has the same maximum capacity.

Implement the `DinnerPlates` class:

### Methods:
1. `DinnerPlates(int capacity)` - Initializes the object with the maximum capacity of the stacks.
2. `void push(int val)` - Pushes the given integer `val` into the leftmost stack with a size less than capacity.
3. `int pop()` - Returns the value at the top of the rightmost non-empty stack and removes it from that stack, returning `-1` if all the stacks are empty.
4. `int popAtStack(int index)` - Returns the value at the top of the stack with the given index `index` and removes it from that stack or returns `-1` if the stack is empty.

---

## Examples

### Example 1:
**Input**:
```plaintext
["DinnerPlates", "push", "push", "push", "push", "push", "popAtStack", "push", "push", "popAtStack", "popAtStack", "pop", "pop", "pop", "pop", "pop"]
[[2], [1], [2], [3], [4], [5], [0], [20], [21], [0], [2], [], [], [], [], []]
```
**Output**:
```plaintext
[null, null, null, null, null, null, 2, null, null, 20, 21, 5, 4, 3, 1, -1]
```
**Explanation**:
- Initialize the DinnerPlates object with a capacity of 2.
- Push elements into the stacks.
- Pop from specific stacks using the popAtStack method.
- Pop from the last stack using the pop method.
