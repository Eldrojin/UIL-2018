import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class homealone {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner (new File("homealone.dat"));
        int sets = new Integer(in.nextLine());
        while (sets-- > 0) {
            System.out.println("HELP!! " + in.nextLine().toUpperCase() + "!!");
        }
    }
}
