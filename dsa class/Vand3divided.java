
import java.util.*;

public class Vand3divided {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x >= 5 && (x % 3 == 0 || x % 5 == 0)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
