# Problem
# Find the first/leftmost digit of a positive number.
# Input
# 58329
# Output
5
n = int(input())

while n >= 10:
    n = n // 10

print(n)