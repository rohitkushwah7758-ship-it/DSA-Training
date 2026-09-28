// import java.util.*;
// public class array{
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr []=new int[n];
          
//         for(int i=0; i<n; i++){

//             arr[i] =sc.nextInt();
//             System.out.println(arr[i]);


//         }
//     }
// }


// import java.util.*;

// public class array {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         // Array input
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Initially first element ko max aur min maan lo
//         int max = arr[0];
//         int min = arr[0];

//         // Find max and min
//         for (int i = 1; i < n; i++) {

//             if (arr[i] > max) {
//                 max = arr[i];
//             }

//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }

//         System.out.println("Maximum = " + max);
//         System.out.println("Minimum = " + min);
//     }
// }





// import java.util.*;
// public class array{
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         int largest=Integer.MIN_VALUE;
//         int secondLargest=Integer.MIN_VALUE;
//         int arr[]={3,5,6,7,10,9};
//     Arrays.sort(arr);
//     System.out.println(arr[n-2]);
//     for(int i=0; i<n; i++){
//         if(arr[i]>largest){
//             secondLargest=largest;
//             largest=arr[i];
        
//         } 
//     }
//     }
// }


// Kth largest  element in array
import java.util.*;

public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // Sort array
        Arrays.sort(arr);

        // Find kth largest
        int ans = arr[n - k];

        System.out.println("Kth Largest = " + ans);
    }
}