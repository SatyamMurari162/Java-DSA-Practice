P22. Count Trailing Zeroes in a Factorial
Problem: Without computing the full factorial, find how many trailing zeroes are in 100!.
Approach:
Trailing zeroes come from factors of 10, which come from pairs of 2 and 5 — since 2s are far more abundant than 5s in
any factorial, the count of trailing zeroes equals the count of factor-5s, computed as n//5 + n//25 + n//125 + ...