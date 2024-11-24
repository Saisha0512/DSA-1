# 1425. Constrained Subsequence Sum

## Problem Statement
Given an integer array `nums` and an integer `k`, return the **maximum sum** of a non-empty subsequence of that array such that for every two consecutive integers in the subsequence, `nums[i]` and `nums[j]` (where `i < j`), the condition `j - i <= k` is satisfied.

A subsequence of an array is obtained by deleting some number of elements (can be zero) from the array, leaving the remaining elements in their original order.

---

## Examples

### Example 1:
**Input**:  
```plaintext
nums = [10,2,-10,5,20], k = 2
```
**Output**:
```plaintext
37
```
**Explanation**:
the subsequence is:
```plaintext
[10, 2, 5, 20]
```

### Example 2:
**Input**:  
```plaintext
nums = [-1,-2,-3], k = 1
```
**Output**:
```plaintext
-1
```
**Explanation**:
the subsequence must be a non-empty, so we choose the largest number:
```plaintext
[-1]
```

### Example 3:
**Input**:  
```plaintext
nums = [10,-2,-10,-5,20], k = 2
```
**Output**:
```plaintext
23
```
**Explanation**:
the subsequence must be a non-empty, so we choose the largest number:
```plaintext
[10, -2, -5, 20]
```
