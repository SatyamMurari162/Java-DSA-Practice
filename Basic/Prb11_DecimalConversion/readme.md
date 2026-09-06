P11. Binary to Decimal Conversion

Problem: Convert the binary string '110101' to its decimal value.

Approach:
Process the binary string left to right; at each digit, multiply the running total by 2 and add the new digit — this is
Horner's method applied to base conversion.