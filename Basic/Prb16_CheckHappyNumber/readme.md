P16. Check Happy Number

Problem: A happy number eventually reaches 1 when replaced repeatedly by the sum of the squares of its digits
(cycling numbers other than 1 are 'unhappy'). Check if 19 is happy.

Approach:
Repeatedly replace n with the sum of squares of its digits. Track SEEN values in a set to detect a cycle (unhappy)
versus reaching 1 (happy) — without cycle detection this could loop forever on unhappy numbers.