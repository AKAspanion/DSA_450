import java.io.*;

public class Reverse_The_Array {
   public static void main(String args[]) throws IOException {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(read.readLine());

      while (t-- > 0) {
         int n = Integer.parseInt(read.readLine());
         String str[] = read.readLine().trim().split(" ");

         int input[] = new int[n];
         for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(str[i]);
         }

         // int x = Integer.parseInt(read.readLine());
         Reverse_The_Array_Logic obj = new Reverse_The_Array_Logic();
         obj.reverseArray(input, n);

         for (int i = 0; i < n; i++)
            System.out.print(input[i] + " ");

         System.out.println();
      }
   }
}

class Reverse_The_Array_Logic {
   public void reverseArray(int arr[], int n) throws IOException {
      int i, t;
      for (i = 0; i < n / 2; i++) {
         t = arr[i];
         arr[i] = arr[n - i - 1];
         arr[n - i - 1] = t;
      }
   }
}