# Spiral Matrix IV  

**Difficulty**: Medium  

---

## Problem Statement  

You are given two integers `m` and `n`, which represent the dimensions of a matrix.

You are also given the head of a **linked list** of integers.

Generate an \(m \times n\) matrix that contains the integers in the linked list presented in **spiral order** (clockwise), starting from the top-left of the matrix. If there are remaining empty spaces, fill them with `-1`.

Return the generated matrix.

---

## Examples  

### Example 1  

**Input**:  
```plaintext
m = 3, n = 5, head = [3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0]
```  

**Output**:  
```plaintext
[[3, 0, 2, 6, 8], 
 [5, 0, -1, -1, 1], 
 [5, 2, 4, 9, 7]]
```  

Explanation: The diagram above shows how the values are printed in the matrix.  
Note that the remaining spaces in the matrix are filled with `-1`.

---

### Example 2  

**Input**:  
```plaintext
m = 1, n = 4, head = [0, 1, 2]
```  

**Output**:  
```plaintext
[[0, 1, 2, -1]]
```  

Explanation: The diagram above shows how the values are printed from left to right in the matrix.  
The last space in the matrix is set to `-1`.

---

## Constraints  

- \( 1 \leq m, n \leq 10^5 \)
- \( 1 \leq m \times n \leq 10^5 \)
- The number of nodes in the list is in the range \([1, m \times n]\).
- \( 0 \leq \text{Node.val} \leq 1000 \)

---

