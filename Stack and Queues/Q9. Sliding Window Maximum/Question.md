# 239. Sliding Window Maximum

## Problem Statement
You are given an array of integers `nums`, and there is a sliding window of size `k` moving from the very left of the array to the very right.  
You can only see the `k` numbers in the window. Each time the sliding window moves right by one position.

### Output:
Return the maximum of each sliding window.

---

## Examples

### Example 1:
**Input**:  
```plaintext
nums = [1,3,-1,-3,5,3,6,7]
k = 3
```
**Output**
```plaintext
[3,3,5,5,6,7]
```
**Explanation**:
The sliding window and their maximum values are as follows:
```plaintext
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
```


### Example 2:
**Input**:  
```plaintext
nums = [1]
k = 1
```
**Output**
```plaintext
[1]
```
