# Permutations  

**Difficulty**: Medium  

---

## Problem Statement  

Given an array `nums` of distinct integers, return all the possible **permutations** of the array. You can return the answer in any order.

---

## Examples  

### Example 1  

**Input**:  
```plaintext
nums = [1, 2, 3]
```  

**Output**:  
```plaintext
[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
```  

---

### Example 2  

**Input**:  
```plaintext
nums = [0, 1]
```  

**Output**:  
```plaintext
[[0, 1], [1, 0]]
```  

---

### Example 3  

**Input**:  
```plaintext
nums = [1]
```  

**Output**:  
```plaintext
[[1]]
```  

---

## Constraints  

- \( 1 \leq \text{nums.length} \leq 6 \)  
- \( -10 \leq \text{nums}[i] \leq 10 \)  
- All integers in `nums` are unique.  

---

### Time Complexity  
- The number of permutations of an array of length \( n \) is \( n! \).
- For each permutation, generating it takes \( O(n) \).
- Hence, the time complexity is \( O(n \cdot n!) \).

### Space Complexity  
- The space complexity is \( O(n) \) due to the recursion stack and temporary list used to store permutations.