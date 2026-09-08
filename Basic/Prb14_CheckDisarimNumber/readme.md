P14. Check Disarium Number

Problem: A Disarium number is one where the sum of its digits, each raised to the POSITION it occupies (1st digit^1,
2nd digit^2, ...), equals the number itself. Check if 135 is Disarium (1¹+3²+5³ = 1+9+125 = 135).

Approach:
Enumerate digits with their 1-based position, raise each digit to its position power, sum, and compare to the original
number