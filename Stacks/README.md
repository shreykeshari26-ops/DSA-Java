# Min Stack (Java)

This repository contains a Java implementation of the **Min Stack** problem.

---

## 📌 Problem Statement
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

---

## 🧠 Approach
- Use two arrays:
    - One to store stack values
    - One to store the minimum value at each index
- While pushing, store the minimum so far
- This allows `getMin()` in O(1) time

---

## ⏱ Time & Space Complexity
| Operation | Time |
|---------|------|
| push    | O(1) |
| pop     | O(1) |
| top     | O(1) |
| getMin  | O(1) |

**Space Complexity:** O(n)

---

## 🧪 Example
```java
MinStack st = new MinStack();
st.push(2);
st.push(1);
st.push(3);
System.out.println(st.getMin()); // 1
