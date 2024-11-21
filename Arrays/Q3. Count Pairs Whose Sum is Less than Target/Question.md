# Count Pairs Whose Sum is Less than Target

**Difficulty**: Easy

---

## Problem Statement

Given a 0-indexed integer array `nums` of length `n` and an integer `target`, return the number of pairs `(i, j)` where:
- \( 0 \leq i < j < n \), and  
- \( \text{nums}[i] + \text{nums}[j] < \text{target} \).

---

## Examples

### Example 1:

**Input**:
```bash
nums = [-1, 1, 2, 3, 1]
target = 2
```

**Output**:
```bash
3
```

**Explanation**:
- There are 3 pairs of indices that satisfy the conditions:
  - \( (0, 1) \): \( -1 + 1 = 0 < 2 \)
  - \( (0, 2) \): \( -1 + 2 = 1 < 2 \)
  - \( (0, 4) \): \( -1 + 1 = 0 < 2 \)
- Note: Pair \( (0, 3) \) is not counted because \( -1 + 3 = 2 \), which is not strictly less than the target.

---

### Example 2:

**Input**:
```bash
nums = [-6, 2, 5, -2, -7, -1, 3]
target = -2
```

**Output**:
```bash
10
```

**Explanation**:
- There are 10 pairs of indices that satisfy the conditions:
  - \( (0, 1) \): \( -6 + 2 = -4 < -2 \)
  - \( (0, 3) \): \( -6 + -2 = -8 < -2 \)
  - \( (0, 4) \): \( -6 + -7 = -13 < -2 \)
  - \( (0, 5) \): \( -6 + -1 = -7 < -2 \)
  - \( (0, 6) \): \( -6 + 3 = -3 < -2 \)
  - \( (1, 4) \): \( 2 + -7 = -5 < -2 \)
  - \( (3, 4) \): \( -2 + -7 = -9 < -2 \)
  - \( (3, 5) \): \( -2 + -1 = -3 < -2 \)
  - \( (4, 5) \): \( -7 + -1 = -8 < -2 \)
  - \( (4, 6) \): \( -7 + 3 = -4 < -2 \)

---

## Constraints:
- \( 1 \leq \text{nums.length} = n \leq 50 \)
- \( -50 \leq \text{nums}[i], \text{target} \leq 50 \)

