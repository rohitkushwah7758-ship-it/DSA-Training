n = int(input())

count = 0

while True:
    digit = n % 10

    if digit == 7:
        count += 1

    n = n // 10

    if n == 0:
        break

print(count)