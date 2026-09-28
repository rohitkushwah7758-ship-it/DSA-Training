n = int(input())

original = n
length = len(str(n))
sum = 0

while n > 0:
    digit = n % 10
    sum = sum + digit ** length
    n = n // 10

if sum == original:
    print("Armstrong")
else:
    print("Not Armstrong")