Problem: Remove duplicate characters from 'programming', keeping only the FIRST occurrence of each letter,
preserving original order.

Approach:
Use a set to track characters already seen. Build the result by including a character only if it hasn't appeared before,
then mark it as seen.