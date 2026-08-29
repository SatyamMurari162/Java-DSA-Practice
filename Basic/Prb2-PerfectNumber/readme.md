Problem: A perfect number equals the sum of its proper divisors (excluding itself). Check whether 28 is a perfect
number.

Approach:
Find all divisors from 1 to n-1 that divide n evenly, sum them, and compare to n. Looping only up to n//2 is a small
optimisation since no divisor (other than n itself) exceeds n/2.

Example : - 1. 28(1+2+4+7+14 = 28) is a perfect number
            2. 32(1+2+4+8+16 = 31) is not a perfect number