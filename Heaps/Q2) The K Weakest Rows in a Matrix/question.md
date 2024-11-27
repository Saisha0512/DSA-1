## The K Weakest Rows in a Matrix

You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

- The number of soldiers in row i is less than the number of soldiers in row j.<br>
- Both rows have the same number of soldiers and i < j.<br>

Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.

 
Example 1:

Input: mat = <br>
[[1,1,0,0,0],<br>
 [1,1,1,1,0],<br>
 [1,0,0,0,0],<br>
 [1,1,0,0,0],<br>
 [1,1,1,1,1]], <br>
k = 3<br>

Output: [2,0,3]<br>

Explanation: <br>
The number of soldiers in each row is: 
- Row 0: 2 
- Row 1: 4 
- Row 2: 1 
- Row 3: 2 
- Row 4: 5
  
The rows ordered from weakest to strongest are [2,0,3,1,4].

Example 2:<br>

Input: mat = <br>
[[1,0,0,0],<br>
 [1,1,1,1],<br>
 [1,0,0,0],<br>
 [1,0,0,0]], <br>
k = 2<br>

Output: [0,2]<br>

Explanation: <br>
The number of soldiers in each row is: 
- Row 0: 1 
- Row 1: 4 
- Row 2: 1 
- Row 3: 1
  
The rows ordered from weakest to strongest are [0,2,3,1].
 

Constraints:<br>

- m == mat.length<br>
- n == mat[i].length<br>
- 2 <= n, m <= 100<br>
- 1 <= k <= m<br>
- matrix[i][j] is either 0 or 1.<br>
