# Build Array from Permutation

**Difficulty**: Easy

---

## Problem Statement  

Given a zero-based permutation `nums` (0-indexed), build an array `ans` of the same length such that:  
\[
\text{ans[i]} = \text{nums[nums[i]]}
\]  
for each \( 0 \leq i < \text{nums.length} \), and return it.

A zero-based permutation `nums` is an array of distinct integers from \( 0 \) to \( \text{nums.length} - 1 \) (inclusive).  

---

## Examples  

### Example 1  

**Input**:  
```plaintext
nums = [0, 2, 1, 5, 3, 4]
```  

**Output**:  
```plaintext
[0, 1, 2, 4, 5, 3]
```  

**Explanation**:  
The array `ans` is built as follows:  
\[
\text{ans} = [\text{nums[nums[0]]}, \text{nums[nums[1]]}, \text{nums[nums[2]]}, \text{nums[nums[3]]}, \text{nums[nums[4]]}, \text{nums[nums[5]]}]
\]  
\[
= [\text{nums[0]}, \text{nums[2]}, \text{nums[1]}, \text{nums[5]}, \text{nums[3]}, \text{nums[4]}]
\]  
\[
= [0, 1, 2, 4, 5, 3]
\]  

---

### Example 2  

**Input**:  
```plaintext
nums = [5, 0, 1, 2, 3, 4]
```  

**Output**:  
```plaintext
[4, 5, 0, 1, 2, 3]
```  

**Explanation**:  
The array `ans` is built as follows:  
\[
\text{ans} = [\text{nums[nums[0]]}, \text{nums[nums[1]]}, \text{nums[nums[2]]}, \text{nums[nums[3]]}, \text{nums[nums[4]]}, \text{nums[nums[5]]}]
\]  
\[
= [\text{nums[5]}, \text{nums[0]}, \text{nums[1]}, \text{nums[2]}, \text{nums[3]}, \text{nums[4]}]
\]  
\[
= [4, 5, 0, 1, 2, 3]
\]  

---

## Constraints  

- \( 1 \leq \text{nums.length} \leq 1000 \)  
- \( 0 \leq \text{nums[i]} < \text{nums.length} \)  
- The elements in `nums` are distinct.  

---

## Follow-Up  

Can you solve it without using extra space (i.e., \( O(1) \) memory)?  

---