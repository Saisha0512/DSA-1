# 735. Asteroid Collision

## Problem Statement
We are given an array `asteroids` of integers representing asteroids in a row.

- The **absolute value** of each asteroid represents its size.
- The **sign** represents its direction:
  - Positive (`+`): moving to the right.
  - Negative (`-`): moving to the left.

All asteroids move at the same speed.

When two asteroids meet:
- The smaller one will explode.
- If both are the same size, both will explode.
- Two asteroids moving in the same direction will never meet.

Return the state of the asteroids after all collisions.

---

## Examples

### Example 1:
**Input**:  
```plaintext
asteroids = [5,10,-5]
```
**Output**:
```plaintext
[5,10]
```
**Explanation**:
- The 10 and -5 collide, resulting in 10.
- The 5 and 10 never collide.

### Example 2:
**Input**:  
```plaintext
asteroids = [8,-8]
```
**Output**:
```plaintext
[]
```
**Explanation**:
- The 8 and -8 collide, exploding each other.

### Example 3:
**Input**:  
```plaintext
asteroids = [10,2,-5]
```
**Output**:
```plaintext
[10]
```
**Explanation**:
- The 2 and -5 collide, resulting in -5.
- The 10 and -5 collide, resulting in 10.
