# Rotate Image  

**Difficulty**: Medium  

---

## Problem Statement  

You are given an \(n \times n\) 2D matrix representing an image. Rotate the image by 90 degrees **clockwise**.

- You have to rotate the image **in-place**, which means you must modify the input 2D matrix directly.  
- DO NOT allocate another 2D matrix for the rotation.

---

## Examples  

### Example 1  

**Input**:  
```plaintext
matrix = [[1,2,3],[4,5,6],[7,8,9]]
```  

**Output**:  
```plaintext
[[7,4,1],[8,5,2],[9,6,3]]
```  

---

### Example 2  

**Input**:  
```plaintext
matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
```  

**Output**:  
```plaintext
[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
```  

---

## Constraints  

- \( n = \text{matrix.length} = \text{matrix}[i].\text{length} \)  
- \( 1 \leq n \leq 20 \)  
- \( -1000 \leq \text{matrix}[i][j] \leq 1000 \)  

---

## Approach  

### Method 1: Rotate Layers  

1. **Transpose the matrix**: Convert rows to columns.
    - For each element at position (i, j), swap it with the element at position (j, i).  
2. **Reverse the rows**: Reverse the order of elements in each row.

This results in a 90-degree clockwise rotation of the matrix.

---

### Example Walkthrough  

Given the matrix:  
```plaintext
[[1, 2, 3],  
 [4, 5, 6],  
 [7, 8, 9]]
```

1. **Transpose the matrix**: Swap (i, j) with (j, i).
   Resulting matrix:  
```plaintext
[[1, 4, 7],  
 [2, 5, 8],  
 [3, 6, 9]]
```

2. **Reverse the rows**:
   Resulting matrix after reversal:  
```plaintext
[[7, 4, 1],  
 [8, 5, 2],  
 [9, 6, 3]]
```

This is the rotated matrix.

---

### Time Complexity  
- Transposing the matrix takes \(O(n^2)\).
- Reversing the rows also takes \(O(n^2)\).
- Hence, the overall time complexity is \(O(n^2)\).

### Space Complexity  
- The rotation is done in-place, so the space complexity is \(O(1)\) extra space.