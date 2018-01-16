import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DryRun {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("dryrun.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            System.out.println("I like " + in.nextLine() + ".");
        }
    }
}
