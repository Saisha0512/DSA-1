# Q3. Knapsack

**Difficulty**: Medium

There are `N` items, numbered `1,2,…,N` For each i (1 <= i <= N), Item i has a weight of `w[i]` and a value of `v[i]`.

Taro has decided to choose some of the N items and carry them home in a knapsack. The capacity of the knapsack is 
`W`, which means that the sum of the weights of items taken must be at most W.

Find the maximum possible sum of the values of items that Taro takes home.


## Examples

### Example 1:

**Input**:
```
N = 3, W = 8
w = [3,4,5]
v = [30,50,60]
```

**Output**:
```
90
```

**Explanation**:
Items 1 and 3 should be taken. Then, the sum of the weights is 3+5=8, and the sum of the values is 30+60=90.

### Example 2:

**Input**:
```
N = 5, W = 5
w = [1,1,1,1,1]
v = [1000000000,1000000000,1000000000,1000000000,1000000000]
```

**Output**:
```
5000000000
```

**Explanation**:
The answer may not fit into a 32-bit integer type.

### Example 3:

**Input**:
```
N = 6, W = 15
w = [6,5,6,6,3,7]
v = [5,6,4,6,5,2]
```

**Output**:
```
17
```

**Explanation**:
Items 2,4 and 5 should be taken. Then, the sum of the weights is 5+6+3=14, and the sum of the values is 6+6+5=17.

## Constraints:

- `All values in input are integers.`
- `1 <= N <= 100`
- `1 <= W <= 10^5`
- `1 <= w[i] <= W`
- `1 <= v[i] <= 10^9`


