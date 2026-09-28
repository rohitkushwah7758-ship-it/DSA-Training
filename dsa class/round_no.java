// Round number
import java.util.*;

public class round_no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int place = 1;
            int count = 0;

            ArrayList<Integer> ans = new ArrayList<>();

            while (n > 0) {

                int digit = n % 10;

                if (digit != 0) {
                    int roundNumber = digit * place;
                    ans.add(roundNumber);
                    count++;
                }

                n = n / 10;
                place = place * 10;
            }

            System.out.print(count);

            for (int num : ans) {
                System.out.print(" " + num);
            }

            System.out.println();
        }

        sc.close();
    }
}



// python
// t = int(input())

// while t > 0:
//     n = int(input())

//     place = 1
//     ans = []

//     while n > 0:
//         digit = n % 10

//         if digit != 0:
//             round_number = digit * place
//             ans.append(round_number)

//         n = n // 10
//         place = place * 10

//     print(len(ans), *ans)

//     t = t - 1