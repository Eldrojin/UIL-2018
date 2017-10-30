import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Summation {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("summation.dat"));
        while (in.hasNext()) {
            String line = in.nextLine();
            line = line.replaceAll("[\\(\\):]", "");
            line = line.replaceAll(" \\+", "");
            line = line.replaceAll("x2", "");
            line = line.replaceAll("x", "");
            line = line.replaceAll(",", " ");
            String[] eq = line.split(" ");
            int start = new Integer(eq[0]), end = new Integer(eq[1]);
            int a = new Integer(eq[2]), b = new Integer(eq[3]), c = new Integer(eq[4]);
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += a * (int)(Math.pow(i, 2)) + b * i + c;
            }
            System.out.println(sum);
        }
    }
}
