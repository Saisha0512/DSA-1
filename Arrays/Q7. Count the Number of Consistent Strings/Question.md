# Count the Number of Consistent Strings  

**Difficulty**: Easy  

---

## Problem Statement  

You are given:  
- A string `allowed` consisting of distinct characters.  
- An array of strings `words`.  

A string is **consistent** if **all characters** in the string appear in the string `allowed`.  

Return the number of **consistent strings** in the array `words`.  

---

## Examples  

### Example 1  

**Input**:  
```plaintext
allowed = "ab"
words = ["ad", "bd", "aaab", "baa", "badab"]
```  

**Output**:  
```plaintext
2
```  

**Explanation**:  
Strings `"aaab"` and `"baa"` are consistent since they only contain characters `'a'` and `'b'`.  

---

### Example 2  

**Input**:  
```plaintext
allowed = "abc"
words = ["a", "b", "c", "ab", "ac", "bc", "abc"]
```  

**Output**:  
```plaintext
7
```  

**Explanation**:  
All strings are consistent.  

---

### Example 3  

**Input**:  
```plaintext
allowed = "cad"
words = ["cc", "acd", "b", "ba", "bac", "bad", "ac", "d"]
```  

**Output**:  
```plaintext
4
```  

**Explanation**:  
Strings `"cc"`, `"acd"`, `"ac"`, and `"d"` are consistent.  

---

## Constraints  

- \( 1 \leq \text{words.length} \leq 10^4 \)  
- \( 1 \leq \text{allowed.length} \leq 26 \)  
- \( 1 \leq \text{words[i].length} \leq 10 \)  
- The characters in `allowed` are distinct.  
- `words[i]` and `allowed` contain only lowercase English letters.  

---