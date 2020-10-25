import java.io.*;

class Pair_CompPairs {
   int max, min;
}

public class Max_Min_Array_CompPairs {
   public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      String str[] = br.readLine().trim().split(" ");
      int input[] = new int[n];

      for (int i = 0; i < n; i++) {
         input[i] = Integer.parseInt(str[i]);
      }
      Pair_CompPairs q = Max_Min_Array_CompPairs_Logic.fun(input, n);
      System.out.println(q.max + " " + q.min);
   }
}

class Max_Min_Array_CompPairs_Logic {
   static Pair_CompPairs fun(int arr[], int n) {
      Pair_CompPairs p = new Pair_CompPairs();
      int i = 0;

      if (n % 2 != 0) {
         p.max = arr[0];
         p.min = arr[0];
      } else {
         p.max = (arr[0] > arr[1]) ? arr[0] : arr[1];
         p.min = (arr[0] < arr[1]) ? arr[0] : arr[1];
      }

      while (i < n - 1) {
         if (arr[i] > arr[i + 1]) {
            p.max = (arr[i] > p.max) ? arr[i] : p.max;
            p.min = (arr[i + 1] < p.min) ? arr[i + 1] : p.min;
         } else {
            p.max = (arr[i + 1] > p.max) ? arr[i + 1] : p.max;
            p.min = (arr[i] < p.min) ? arr[i] : p.min;
         }
         i = i + 2;
      }
      return p;
   }
}