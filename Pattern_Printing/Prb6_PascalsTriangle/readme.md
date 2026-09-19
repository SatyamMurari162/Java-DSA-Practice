P40. Print Pascal's Triangle

Problem: Print the first 5 rows of Pascal's Triangle (each number is the sum of the two numbers directly above it).

Approach:
Each row's values can be computed using binomial coefficients: row i, position j = C(i, j). Alternatively, build each row
from the previous one by summing adjacent pairs, padded with 1s at both ends.