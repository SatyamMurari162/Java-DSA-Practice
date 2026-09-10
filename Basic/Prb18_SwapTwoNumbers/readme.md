P18. Swap Two Numbers Without a Temporary Variable

Problem: Swap the values of a=15 and b=27 without using a third temporary variable.

Approach:
Use arithmetic: first add both into a (a = a+b), then derive the new b by subtracting the original a's contribution (b = a-b,
which is the OLD a), then derive the new a (a = a-b, using the now-updated b). Alternatively, tuple-unpacking swap
works cleanly in Python.