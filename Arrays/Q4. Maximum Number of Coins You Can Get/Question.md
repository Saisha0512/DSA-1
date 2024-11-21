# Maximum Number of Coins You Can Get

**Difficulty**: Medium  

---

## Problem Statement  

There are \(3n\) piles of coins of varying sizes. You and your two friends will take turns picking piles of coins as follows:

1. In each step, you will choose any 3 piles of coins (not necessarily consecutive).  
2. Alice will pick the pile with the maximum number of coins.  
3. You will pick the next pile with the maximum number of coins.  
4. Your friend Bob will pick the last pile.  

Repeat this process until there are no more piles of coins left.  

Given an array of integers `piles`, where `piles[i]` represents the number of coins in the \(i\)-th pile, return the **maximum number of coins** that you can collect.  

---

## Examples  

### Example 1  

**Input**:  
```plaintext
piles = [2, 4, 1, 2, 7, 8]
```  

**Output**:  
```plaintext
9
```  

**Explanation**:  
1. Choose the triplet \( (2, 7, 8) \):  
   - Alice picks the pile with 8 coins.  
   - You pick the pile with 7 coins.  
   - Bob picks the pile with 2 coins.  
2. Choose the triplet \( (1, 2, 4) \):  
   - Alice picks the pile with 4 coins.  
   - You pick the pile with 2 coins.  
   - Bob picks the pile with 1 coin.  

The maximum number of coins you can have is \( 7 + 2 = 9 \).  

**Note**: If you choose a different arrangement, such as \( (1, 2, 8), (2, 4, 7) \), you only get \( 2 + 4 = 6 \), which is not optimal.  

---

### Example 2  

**Input**:  
```plaintext
piles = [2, 4, 5]
```  

**Output**:  
```plaintext
4
```  

---

### Example 3  

**Input**:  
```plaintext
piles = [9, 8, 7, 6, 5, 1, 2, 3, 4]
```  

**Output**:  
```plaintext
18
```  

**Explanation**:  
1. Choose the triplet \( (7, 8, 9) \):  
   - Alice picks the pile with 9 coins.  
   - You pick the pile with 8 coins.  
   - Bob picks the pile with 7 coins.  
2. Choose the triplet \( (4, 5, 6) \):  
   - Alice picks the pile with 6 coins.  
   - You pick the pile with 5 coins.  
   - Bob picks the pile with 4 coins.  

The maximum number of coins you can have is \( 8 + 5 = 18 \).  

---

## Constraints  

- \( 3 \leq \text{piles.length} \leq 10^5 \)  
- \( \text{piles.length} \% 3 = 0 \)  
- \( 1 \leq \text{piles}[i] \leq 10^4 \)  

---  