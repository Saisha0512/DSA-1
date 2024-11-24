# 1598. Crawler Log Folder

## Problem Statement
The LeetCode file system keeps a log each time a user performs a change folder operation. The operations are described as follows:

1. `"../"`: Move to the parent folder of the current folder. If you are already in the main folder, remain in the same folder.
2. `"./"`: Remain in the same folder.
3. `"x/"`: Move to the child folder named `x` (this folder is guaranteed to always exist).

You are given a list of strings `logs` where `logs[i]` is the operation performed by the user at the `i-th` step. The file system starts in the main folder, then the operations in `logs` are performed.

Return the **minimum number of operations** needed to go back to the main folder after the change folder operations.

---

## Examples

### Example 1:
![image](https://github.com/user-attachments/assets/8f292432-6ec9-489b-8e77-f01e4d6b23d8)

**Input**:  
```plaintext
logs = ["d1/","d2/","../","d21/","./"]
```
**Output**:
```plaintext
2
```
**Explanation**:
Use the change folder operation "../" 2 times to go back to the main folder.

### Example 2:
![image](https://github.com/user-attachments/assets/3d716c98-fb43-48f5-9616-8355db95cf5b)

**Input**:  
```plaintext
logs = ["d1/","d2/","./","d3/","../","d31/"]
```
**Output**:
```plaintext
3
```

### Example 3:
**Input**:  
```plaintext
logs = ["d1/","../","../","../"]
```
**Output**:
```plaintext
0
```
