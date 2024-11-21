# Minimum Path Sum  

**Difficulty**: Medium  

---

## Problem Statement  

Given an \( m \times n \) grid filled with non-negative numbers, find a path from the **top left** to the **bottom right**, which minimizes the sum of all numbers along its path.  

You can only move **down** or **right** at any point in time.  

---

## Examples  

### Example 1  

**Input**:  
```plaintext
grid = [[1,3,1],
        [1,5,1],
        [4,2,1]]
```  

**Output**:  
```plaintext
7
```  

**Explanation**:  
The path \( 1 \rightarrow 3 \rightarrow 1 \rightarrow 1 \rightarrow 1 \) minimizes the sum, giving \( 7 \).  

---

### Example 2  

**Input**:  
```plaintext
grid = [[1,2,3],
        [4,5,6]]
```  

**Output**:  
```plaintext
12
```  

---

## Constraints  

- \( m == \text{grid.length} \)  
- \( n == \text{grid[i].length} \)  
- \( 1 \leq m, n \leq 200 \)  
- \( 0 \leq \text{grid[i][j]} \leq 200 \)  

---

