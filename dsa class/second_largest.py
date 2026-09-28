arr = [10, 50, 20, 80, 30]

largest = arr[0]
second = -1

for i in arr:
    if i > largest:
        second = largest
        largest = i

    elif i > second and i != largest:
        second = i

print("Largest =", largest)
print("Second Largest =", second)


# Kth largest element in an array
# import java.util.*;

# public class array {
#     public static void main(String[] args) {

#         Scanner sc = new Scanner(System.in);

#         int n = sc.nextInt();

#         int[] arr = new int[n];

#         // Input array
#         for (int i = 0; i < n; i++) {
#             arr[i] = sc.nextInt();
#         }

#         int k = sc.nextInt();

#         // Sort array
#         Arrays.sort(arr);

#         // Find kth largest
#         int ans = arr[n - k];

#         System.out.println("Kth Largest = " + ans);
#     }
# }

n = int(input())

arr = list(map(int, input().split()))

k = int(input())

arr.sort()

print(arr[n - k])