import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("lucky.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            int marv = new Integer(line[0]);
            int harry = new Integer(line[1]);
            int kevin = new Integer(line[2]);
            String[] counts = new String[kevin];
            Arrays.fill(counts, "");
            for (int i = marv-1; i < kevin; i+=marv) {
                counts[i] += "M";
            }
            for (int i = harry-1; i < kevin; i+=harry) {
                counts[i] += "H";
            }
//            System.out.println(Arrays.toString(counts));
            for (int i = 0; i < kevin; i++) {
                String pos = counts[i];
                if (pos.equals("MH")) {
                    System.out.println("MarvHarry");
                } else if (pos.equals("M")) {
                    System.out.println("Marv");
                } else if (pos.equals("H")) {
                    System.out.println("Harry");
                } else {
                    System.out.println(i + 1);
                }
            }
            System.out.println();
        }
    }
}
