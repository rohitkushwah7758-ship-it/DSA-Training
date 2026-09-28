import java.util.*;
import java.lang.*;
import java.io.*;

class watermelon_problem 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int w = sc.nextInt();
        if(w>2 && w%2==0){
            System.out.println("YES");
        }
        else if(w==0 || w==1 || w==2 ){
            System.out.println("NOt a valid weight");
        }
        else{
            System.out.println("NO");

	}
}
}