# 726. Number of Atoms

## Problem Statement
Given a string `formula` representing a chemical formula, return the count of each atom.

### Rules:
1. The atomic element always starts with an **uppercase character**, followed by zero or more **lowercase letters**, representing its name.
2. One or more digits representing that element's count may follow if the count is greater than `1`. If the count is `1`, no digits will follow.
   - Example: `"H2O"` and `"H2O2"` are valid, but `"H1O2"` is invalid.
3. Two formulas can be concatenated together to produce another formula.
   - Example: `"H2O2He3Mg4"` is a valid formula.
4. A formula placed in parentheses, with an optional count outside the parentheses, is also a formula.
   - Example: `"(H2O2)"` and `"(H2O2)3"` are valid formulas.

### Output:
Return the count of all elements as a string in the following format:
- Each element's name appears in **lexicographical order**.
- Each element's count appears **after its name** (if the count is greater than `1`).

The test cases ensure all values in the output fit within a 32-bit integer.

---

## Examples

### Example 1:
**Input**:  
```plaintext
formula = "H2O"
```
**Output**:
```plaintext
"H2O"
```
**Explanation**:
The count of elements is:
```plaintext
{'H': 2, 'O': 1}
```

### Example 2:
**Input**:  
```plaintext
formula = "Mg(OH)2"
```
**Output**:
```plaintext
"H2MgO2"
```
**Explanation**:
The count of elements is:
```plaintext
{'H': 2, 'Mg': 1, 'O': 2}
```

### Example 1:
**Input**:  
```plaintext
formula = "H2O"
```
**Output**:
```plaintext
"H2O"
```
**Explanation**:
The count of elements is:
```plaintext
{'H': 2, 'O': 1}
```

