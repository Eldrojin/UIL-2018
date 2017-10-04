import java.io.*;
import java.util.StringTokenizer;

public class milk2 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("milk2.in"));
        StringTokenizer in = new StringTokenizer(f.readLine());
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));

        int N = new Integer(in.nextToken());
        int[] cowMilkSchedule = new int[1_000_000];
        while (N-- > 0) {
            in = new StringTokenizer(f.readLine());
        }
    }
}
