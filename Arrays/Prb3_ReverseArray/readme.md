# Reverse an Array

## Problem Statement

Given an integer array `arr`, reverse the elements of the array in-place.

You must modify the original array without creating another array.

### Example 1

**Input:**

```text
arr = [1, 2, 3, 4, 5]
```

**Output:**

```text
[5, 4, 3, 2, 1]
```

### Example 2

**Input:**

```text
arr = [10, 20, 30, 40]
```

**Output:**

```text
[40, 30, 20, 10]
```

## Expected Approach

Use the **Two Pointer Technique**.

* `left` starts from the first index.
* `right` starts from the last index.
* Swap `arr[left]` and `arr[right]`.
* Move `left` forward and `right` backward.
* Continue until `left >= right`.

## Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

### Key Concept

**In-place** means modifying the original array without creating a new array.
