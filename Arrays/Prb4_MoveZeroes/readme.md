# Move Zeroes

## Problem Statement

Given an integer array `arr`, move all `0`s to the end of the array while maintaining the **relative order of the non-zero elements**.

The operation must be performed **in-place**, meaning you should modify the original array without creating another array.

### Example 1

**Input:**

```text
arr = [0, 1, 0, 3, 12]
```

**Output:**

```text
[1, 3, 12, 0, 0]
```

### Example 2

**Input:**

```text
arr = [0, 0, 1]
```

**Output:**

```text
[1, 0, 0]
```

### Important Requirements

* All `0`s must be moved to the end.
* The relative order of non-zero elements must remain unchanged.
* The array must be modified **in-place**.
* Do not create another array.


## Expected Approach

Use the **Two Pointer Technique**.

* `i` → scans every element of the array.
* `j` → keeps track of the position where the next non-zero element should be placed.
* Whenever `arr[i]` is non-zero, swap `arr[i]` with `arr[j]`.
* Increment `j`.

## Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

### Key Concept

The goal is not to remove zeroes. Instead, **keep all non-zero elements in their original order and push the zeroes to the end**.
