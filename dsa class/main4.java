import java.util.*;
import java.lang.*;
import java.io.*;

class main4
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x >= 10 && x % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);

	}
}
