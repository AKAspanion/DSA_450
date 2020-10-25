import java.io.*;

class Pair {
   int max, min;
}

public class Max_Min_Array_Linear {
   public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      String str[] = br.readLine().trim().split(" ");
      int input[] = new int[n];

      for (int i = 0; i < n; i++) {
         input[i] = Integer.parseInt(str[i]);
      }
      Pair q = Max_Min_Array_Logic.fun(input, n);
      System.out.println(q.max + " " + q.min);
   }
}

class Max_Min_Array_Logic {
   static Pair fun(int arr[], int n) {
      Pair p = new Pair();
      p.max = arr[0];
      p.min = arr[0];

      for (int i = 1; i < n; i++) {
         if (arr[i] > p.max)
            p.max = arr[i];
         else if (arr[i] < p.min)
            p.min = arr[i];
      }
      return p;
   }
}