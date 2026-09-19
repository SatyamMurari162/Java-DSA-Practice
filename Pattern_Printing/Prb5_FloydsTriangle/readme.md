P39. Print Floyd's Triangle

Problem: Print Floyd's Triangle with 5 rows — consecutive natural numbers filling each row (1 / 2 3 / 4 5 6 / 7 8 9 10 /
...).

Approach:
Maintain a running counter that never resets — the outer loop controls row count, and the inner loop prints (and
increments) the counter that many times per row.