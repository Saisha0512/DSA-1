# 936. Stamping The Sequence

## Problem Statement
You are given two strings `stamp` and `target`. Initially, there is a string `s` of length `target.length` with all `s[i] == '?'`.

In one turn, you can place the `stamp` over `s` and replace every letter in `s` with the corresponding letter from `stamp`.

### Rules:
1. The `stamp` must be fully contained within the boundaries of `s` to be placed.
2. The goal is to convert `s` to `target` using at most **10 × target.length** turns.

### Output:
Return an array of the index of the left-most letter being stamped at each turn.  
If it is not possible to convert `s` to `target` within the limit, return an empty array.

---

## Examples

### Example 1:
**Input**:  
```plaintext
stamp = "abc"
target = "ababc"
```
**Output**:  
```plaintext
[0,2]
```
**Explanation**:
Initially, s = "?????".
- Place stamp at index 0 to get "abc??".
- Place stamp at index 2 to get "ababc".
Other valid answers include [1,0,2].

### Example 2:
**Input**:  
```plaintext
stamp = "abca"
target = "aabcaca"
```
**Output**:  
```plaintext
[3,0,1]
```
**Explanation**:
Initially, s = "???????".
- Place stamp at index 3 to get "???abca".
- Place stamp at index 0 to get "abcabca".
- Place stamp at index 1 to get "aabcaca".


