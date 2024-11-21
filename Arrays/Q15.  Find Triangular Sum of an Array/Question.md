### Problem: Find Triangular Sum of an Array

**Difficulty**: Medium

#### Problem Statement:

You are given a 0-indexed integer array `nums`, where `nums[i]` is a digit between 0 and 9 (inclusive).

The **triangular sum** of `nums` is the value of the only element present in `nums` after the following process terminates:

1. Let `nums` comprise of `n` elements. If `n == 1`, end the process. Otherwise, create a new 0-indexed integer array `newNums` of length `n - 1`.
2. For each index `i`, where `0 <= i < n - 1`, assign the value of `newNums[i]` as `(nums[i] + nums[i+1]) % 10`, where `%` denotes the modulo operator.
3. Replace the array `nums` with `newNums`.
4. Repeat the entire process starting from step 1.

Return the **triangular sum** of `nums`.

---

### Example 1:

**Input**:
```plaintext
nums = [1,2,3,4,5]
```

**Output**:
```plaintext
8
```

**Explanation**:
The process goes as follows:
1. `nums = [1,2,3,4,5]` → `newNums = [(1+2)%10, (2+3)%10, (3+4)%10, (4+5)%10] = [3, 5, 7, 9]`
2. `nums = [3, 5, 7, 9]` → `newNums = [(3+5)%10, (5+7)%10, (7+9)%10] = [8, 2, 6]`
3. `nums = [8, 2, 6]` → `newNums = [(8+2)%10, (2+6)%10] = [0, 8]`
4. `nums = [0, 8]` → `newNums = [(0+8)%10] = [8]`

The process ends with the triangular sum `8`.

---

### Example 2:

**Input**:
```plaintext
nums = [5]
```

**Output**:
```plaintext
5
```

**Explanation**:
Since there is only one element in `nums`, the triangular sum is the value of that element itself, which is `5`.

---

### Constraints:

- `1 <= nums.length <= 1000`
- `0 <= nums[i] <= 9`

---

