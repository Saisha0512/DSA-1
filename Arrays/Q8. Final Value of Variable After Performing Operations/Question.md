# Final Value of Variable After Performing Operations  

**Difficulty**: Easy  

---

## Problem Statement  

There is a programming language with only four operations and one variable \( X \):  

1. `++X` and `X++` increment the value of \( X \) by 1.  
2. `--X` and `X--` decrement the value of \( X \) by 1.  

Initially, the value of \( X \) is 0.  

Given an array of strings `operations` containing a list of operations, return the **final value of \( X \)** after performing all the operations.  

---

## Examples  

### Example 1  

**Input**:  
```plaintext
operations = ["--X", "X++", "X++"]
```  

**Output**:  
```plaintext
1
```  

**Explanation**:  
- Initially, \( X = 0 \).  
- `--X`: \( X \) is decremented by 1, \( X = 0 - 1 = -1 \).  
- `X++`: \( X \) is incremented by 1, \( X = -1 + 1 = 0 \).  
- `X++`: \( X \) is incremented by 1, \( X = 0 + 1 = 1 \).  

---

### Example 2  

**Input**:  
```plaintext
operations = ["++X", "++X", "X++"]
```  

**Output**:  
```plaintext
3
```  

**Explanation**:  
- Initially, \( X = 0 \).  
- `++X`: \( X \) is incremented by 1, \( X = 0 + 1 = 1 \).  
- `++X`: \( X \) is incremented by 1, \( X = 1 + 1 = 2 \).  
- `X++`: \( X \) is incremented by 1, \( X = 2 + 1 = 3 \).  

---

### Example 3  

**Input**:  
```plaintext
operations = ["X++", "++X", "--X", "X--"]
```  

**Output**:  
```plaintext
0
```  

**Explanation**:  
- Initially, \( X = 0 \).  
- `X++`: \( X \) is incremented by 1, \( X = 0 + 1 = 1 \).  
- `++X`: \( X \) is incremented by 1, \( X = 1 + 1 = 2 \).  
- `--X`: \( X \) is decremented by 1, \( X = 2 - 1 = 1 \).  
- `X--`: \( X \) is decremented by 1, \( X = 1 - 1 = 0 \).  

---

## Constraints  

- \( 1 \leq \text{operations.length} \leq 100 \)  
- `operations[i]` will be either `"++X"`, `"X++"`, `"--X"`, or `"X--"`.  

---