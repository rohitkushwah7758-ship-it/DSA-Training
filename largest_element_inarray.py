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