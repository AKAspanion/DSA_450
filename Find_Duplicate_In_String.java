import java.io.*;

public class Find_Duplicate_In_String {
    static final int NO_OF_CHARS = 256;

    static void populateCounts(String str, int[] count) {
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
    }

    static void printDuplicates(String str) {
        int count[] = new int[NO_OF_CHARS];
        populateCounts(str, count);

        for (int i = 0; i < NO_OF_CHARS; i++)
            if (count[i] > 1)
                System.out.println((char) (i) + ", count = " + count[i]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        printDuplicates(str);
    }
}
