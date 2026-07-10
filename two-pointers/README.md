# Two Pointers

## 🧠 Idea

The Two Pointers technique uses two indices to traverse an array or string efficiently. Instead of checking every possible pair or subarray, the pointers move based on the problem's conditions, often reducing the time complexity from **O(n²)** to **O(n)**.

---

## 📌 When to Use

* Sorted arrays
* Finding pairs with a target sum
* Removing duplicates
* Reversing arrays or strings
* Palindrome checking
* Merging sorted arrays
* Trapping or maximizing values using two ends

---

## 🎯 Common Patterns

### 1. Opposite Ends

One pointer starts from the beginning, the other from the end.

**Used for:**

* Valid Palindrome
* Two Sum II (Sorted Array)
* Container With Most Water

---

### 2. Same Direction

Both pointers move from left to right, usually with one pointer ahead of the other.

**Used for:**

* Remove Duplicates from Sorted Array
* Move Zeroes
* Remove Element

---

## ⚡ Time Complexity

* Usually: **O(n)**
* Space: **O(1)**

---

## ✅ Problems Solved

* [ ] 125. Valid Palindrome
* [ ] 167. Two Sum II – Input Array Is Sorted
* [ ] 26. Remove Duplicates from Sorted Array
* [ ] 27. Remove Element
* [ ] 283. Move Zeroes
* [ ] 344. Reverse String
* [ ] 977. Squares of a Sorted Array
* [ ] 11. Container With Most Water
* [ ] 15. 3Sum
* [ ] 42. Trapping Rain Water

---

## 💡 Key Question

Before solving, ask yourself:

* Can I avoid nested loops?
* Is the array sorted?
* Can two indices move toward each other or together to solve the problem efficiently?
