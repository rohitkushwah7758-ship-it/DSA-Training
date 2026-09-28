# Problem
# Given a number N, find the sum of all even digits.
# Input
# 4827316
# Output
# 20

n = int(input())
sum_even = 0        
while n > 0:
    digit = n % 10

    if digit % 2 == 0:
        sum_even += digit

    n = n // 10
print(sum_even)    