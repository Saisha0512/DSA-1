# 2398. Maximum Number of Robots Within Budget

## Problem Statement
You have `n` robots. You are given two 0-indexed integer arrays, `chargeTimes` and `runningCosts`, both of length `n`. 

- The `i-th` robot costs `chargeTimes[i]` units to charge.
- The `i-th` robot costs `runningCosts[i]` units to run.

You are also given an integer `budget`.

The **total cost** of running `k` chosen robots is calculated as:
max(chargeTimes) + k * sum(runningCosts)


Where:
- `max(chargeTimes)` is the largest charge cost among the `k` robots.
- `sum(runningCosts)` is the sum of running costs among the `k` robots.

Return the **maximum number of consecutive robots** you can run such that the total cost does not exceed `budget`.

---

## Examples

### Example 1:
**Input**:  
chargeTimes = [3,6,1,3,4]  
runningCosts = [2,1,3,4,5]  
budget = 25

**Output**:
3

**Explanation**:
It is possible to run all individual and consecutive pairs of robots within budget.
To obtain the answer 3, consider the first 3 robots. The total cost will be:
- max(3,6,1) + 3 * sum(2,1,3) = 6 + 3 * 6 = 24


