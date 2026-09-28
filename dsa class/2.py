n = int(input())

prev = int(input())
count = 0

for i in range(1, n):
    current = int(input())

    if current - prev >= 3:
         count += 1

    prev = current

    print(count)


# import java.util.*;

# // public class Main {
# //     public static void main(String[] args) {
# //         Scanner sc = new Scanner(System.in);

# //         int n = sc.nextInt();

# //         int prev = sc.nextInt();
# //         int count = 0;

# //         for (int i = 1; i < n; i++) {
# //             int current = sc.nextInt();

# //             if (current - prev >= 3) {
# //                 count++;
# //             }

# //             prev = current;
# //         }

# //         System.out.println(count);
# //     }
# // }