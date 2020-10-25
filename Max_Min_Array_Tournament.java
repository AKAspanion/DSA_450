import java.io.*;

class Pair_Tournament {
   int max, min;
}

public class Max_Min_Array_Tournament {
   public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      String str[] = br.readLine().trim().split(" ");
      int input[] = new int[n];

      for (int i = 0; i < n; i++) {
         input[i] = Integer.parseInt(str[i]);
      }
      Pair_Tournament q = Max_Min_Array_Tournament_Logic.fun(input, 0, n);
      System.out.println(q.max + " " + q.min);
   }
}

class Max_Min_Array_Tournament_Logic {
   static Pair_Tournament fun(int arr[], int l, int h) {
      Pair_Tournament p = new Pair_Tournament();
      Pair_Tournament lp = new Pair_Tournament();
      Pair_Tournament rp = new Pair_Tournament();
      int m;

      if (l == h) {
         p.max = arr[0];
         p.min = arr[0];
      } else if (h - l == 1) {
         p.max = (arr[l] > arr[h]) ? arr[l] : arr[h];
         p.min = (arr[l] < arr[h]) ? arr[l] : arr[h];
      } else {
         m = (l + h) / 2;
         lp = fun(arr, l, m);
         rp = fun(arr, m + 1, h);

         p.max = (lp.max > rp.max) ? lp.max : rp.max;
         p.min = (lp.min < rp.min) ? lp.min : rp.min;
      }
      return p;
   }
}