import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("student/factorial.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            int n = new Integer(in.nextLine());
            for (int i = n; i > 1; i--) {
                System.out.print(i + "x");
            }
            System.out.print(1);
            System.out.println();
        }
    }
}
