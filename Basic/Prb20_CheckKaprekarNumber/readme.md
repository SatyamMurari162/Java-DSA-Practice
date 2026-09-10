P21. Check Kaprekar Number

Problem: A Kaprekar number's square can be split into two parts that sum back to the original number (e.g., 45² =
2025, split as 20+25 = 45). Check if 297 is Kaprekar (297² = 88209).

Approach:
Square the number, convert to a string, try splitting it at every possible position, and check if any split's two parts sum
to the original number.