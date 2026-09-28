arr = [10, 50, 20, 80, 30]

largest = arr[0]

for i in arr:
    if i > largest:
        largest = i

print("Largest =", largest)


# smallest 
arr = [10, 50, 5, 80, 30]

smallest = arr[0]

for i in arr:
    if i < smallest:
        smallest = i

print("Smallest =", smallest)

# reverse
arr = [10, 20, 30, 40, 50]

for i in range(len(arr) - 1, -1, -1):
    print(arr[i], end=" ")


# even or odd
arr = [10, 15, 20, 25, 30]

even = 0
odd = 0

for i in arr:
    if i % 2 == 0:
        even += 1
    else:
        odd += 1

print("Even =", even)
print("Odd =", odd)


# element search
arr = [10, 20, 30, 40, 50]

target = int(input("Enter number: "))

found = False

for i in arr:
    if i == target:
        found = True
        break

if found:
    print("Element found")
else:
    print("Element not found")

# target
arr = [10, 20, 30, 40, 50]

target = 40

for i in range(len(arr)):
    if arr[i] == target:
        print("Index =", i)
        break