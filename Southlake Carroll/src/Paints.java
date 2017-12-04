import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Paints {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("paints.dat"));
        int sets = new Integer(in.nextLine());
        while (sets-- > 0) {
            String[] line1 = in.nextLine().split(" ");

        }
    }
}
